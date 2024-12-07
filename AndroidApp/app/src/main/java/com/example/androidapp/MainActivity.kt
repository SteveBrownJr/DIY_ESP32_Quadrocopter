package com.example.androidapp

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
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

        setupAutoDecrease(seekBar2,"xValue")
        setupAutoDecrease(seekBar3,"yValue")
        setupAutoDecrease(seekBar4,"rotateValue")
        setupAutoDecrease(seekBar5,"powerValue")
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

    fun setupAutoDecrease(seekBar: SeekBar, name : String) {
        val handler = Handler(Looper.getMainLooper())
        var isUserTouching = false

        // Listener to track user interaction
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if(name == "xValue"){
                    xValue = progress
                }
                if(name == "yValue"){
                    yValue = progress
                }
                if(name == "rotateValue"){
                    rotateValue = progress
                }
                if(name == "powerValue"){
                    powerValue = progress
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                isUserTouching = true
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                isUserTouching = false
            }
        })

        // Periodic task to decrease the value if not touched
        val runnable = object : Runnable {
            override fun run() {
                if (!isUserTouching) {
                    if(seekBar.progress > 132){
                        seekBar.progress = (seekBar.progress - 5).coerceAtLeast(seekBar.min)
                    }
                    else{
                        if(seekBar.progress > 127){
                            seekBar.progress = (seekBar.progress - 1).coerceAtLeast(seekBar.min)
                        }
                    }
                    if (seekBar.progress < 122){
                        seekBar.progress = (seekBar.progress + 5).coerceAtLeast(seekBar.min)
                    }
                    else{
                        if (seekBar.progress < 127){
                            seekBar.progress = (seekBar.progress + 1).coerceAtLeast(seekBar.min)
                        }
                    }
                }
                handler.postDelayed(this, 1000) // Adjust delay as needed (e.g., 1000ms = 1s)
            }
        }

        // Start the periodic check
        handler.post(runnable)
    }

    private fun initializeBluetooth() {
        try {
            bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
            val device: BluetoothDevice? =
                bluetoothAdapter?.bondedDevices?.find { it.name == "Quadrocopter" } // Replace with your ESP32's name
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
            val data = byteArrayOf(xValue.toUByte().toByte(), yValue.toUByte().toByte(), rotateValue.toUByte().toByte(), powerValue.toUByte().toByte());
            outputStream?.write(data)
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