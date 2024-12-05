#include <BluetoothSerial.h>

#define Device_Bluetooth_name "Barna A34 eszköze"
#define sizeofinputbuffer 1024

BluetoothSerial SerialBT;
uint8_t inputbuffer[sizeofinputbuffer];

void setup() {
  Serial.begin(115200);
  SerialBT.begin("ESP32");
  //This is a simple callback function if we recieve some data we copy to our buffer which is in the data section;
  SerialBT.onData([](const uint8_t *buffer, size_t size){
    memset(inputbuffer,sizeofinputbuffer, 0);
    inputbuffer[sizeofinputbuffer-1]='\0';
    if(size < sizeofinputbuffer-1)
      memcpy(inputbuffer,buffer,size);
    else
      memcpy(inputbuffer,buffer,sizeofinputbuffer);
    for(int i = 0; i<sizeofinputbuffer-2;i++){
      if(inputbuffer[i]=='\n'){
        inputbuffer[i] ='\r';
        inputbuffer[i+1]='\n';
        inputbuffer[i+2]='\0';
        break;
      }
    }
    SerialBT.flush();
  });
}

void loop() {
  Serial.write((char*)(& inputbuffer[0]),strlen((char*)(& inputbuffer[0])));
  delay(100);
}