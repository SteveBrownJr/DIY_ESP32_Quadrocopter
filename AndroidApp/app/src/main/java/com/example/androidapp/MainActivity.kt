package com.example.androidapp

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Handler
import android.widget.SeekBar
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresPermission
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.io.OutputStream
import java.util.UUID

class MainActivity : AppCompatActivity() {
    private var bluetoothAdapter: BluetoothAdapter? = null
    private var bluetoothSocket: BluetoothSocket? = null
    private var outputStream: OutputStream? = null
    private val handler = Handler()
    private var sendRunnable: Runnable? = null

    private var xValue = 128
    private var yValue = 128
    private var rotateValue = 128
    private var powerValue = 128

    private val bluetoothPermissions = arrayOf(
        Manifest.permission.BLUETOOTH,
        Manifest.permission.BLUETOOTH_ADMIN,
        Manifest.permission.BLUETOOTH_CONNECT
    )

    private val requestBluetoothPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { permissions ->
            val allGranted = permissions.values.all { it }
            if (allGranted) {
                initializeBluetooth()
            } else {
                // Handle permission denied case
                // You might want to show a dialog or message to the user
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitymain)

        val seekBar2 = findViewById<SeekBar>(R.id.seekBar2)
        val seekBar3 = findViewById<SeekBar>(R.id.seekBar3)
        val seekBar4 = findViewById<SeekBar>(R.id.seekBar4)
        val seekBar5 = findViewById<SeekBar>(R.id.seekBar5)

        seekBar2.setOnSeekBarChangeListener(createSeekBarChangeListener { progress -> xValue = progress })
        seekBar3.setOnSeekBarChangeListener(createSeekBarChangeListener { progress -> yValue = progress })
        seekBar4.setOnSeekBarChangeListener(createSeekBarChangeListener { progress -> rotateValue = progress })
        seekBar5.setOnSeekBarChangeListener(createSeekBarChangeListener { progress -> powerValue = progress })

        if (hasBluetoothPermissions()) {
            initializeBluetooth()
        } else {
            requestBluetoothPermissionLauncher.launch(bluetoothPermissions)
        }
        startSendingData()
    }

    private fun hasBluetoothPermissions(): Boolean {
        return bluetoothPermissions.all {
            ContextCompat.checkSelfPermission(this, it) == PackageManager.PERMISSION_GRANTED
        }
    }

    private fun createSeekBarChangeListener(onProgressChanged: (progress: Int) -> Unit) =
        object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                onProgressChanged(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        }


    private fun initializeBluetooth() {
        try {
            bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
            val device: BluetoothDevice? =
                bluetoothAdapter?.bondedDevices?.find { it.name == "ESP32" } // Replace with your ESP32's name
            val uuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB") // Standard UUID for SPP
            bluetoothSocket = device?.createRfcommSocketToServiceRecord(uuid)
            bluetoothSocket?.connect()
            outputStream = bluetoothSocket?.outputStream
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun startSendingData() {
        sendRunnable = object : Runnable {
            override fun run() {
                sendData()
                handler.postDelayed(this, 50)
            }
        }
        handler.post(sendRunnable!!)
    }

    private fun sendData() {
        try {
            val data = "X:$xValue,Y:$yValue,Rotate:$rotateValue,Power:$powerValue\n"
            outputStream?.write(data.toByteArray())
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(sendRunnable!!)
        outputStream?.close()
        bluetoothSocket?.close()
    }
}