#include "BluetoothSerial.h"

BluetoothSerial SerialBT;

static float xTarget=0.0f;
static float yTarget=0.0f;
static float targetRotation=0.0f;
static float targetPower=0.0f;

static void DataFetcher(const uint8_t *buffer, size_t size){
  if(size>0){
    xTarget = static_cast<float>(buffer[0]-127);
    if(size>1){
      yTarget = static_cast<float>(buffer[1]-127);
        if(size>2){
          targetRotation = static_cast<float>(buffer[2]-127);
          if(size>3){
            targetPower = static_cast<float>(buffer[3]-127);
        }
      }
    }
  }
}

void BeginQuadroControl(const char* name){
  SerialBT.begin(name);
  SerialBT.onData(DataFetcher);
}



float GetXTarget(){
  return xTarget;
}
float GetYTarget(){
  return yTarget;
}
float GetTargetPower(){
  return targetPower;
}
float GetTargetRotation(){
  return targetRotation;
}

void setup() {
  Serial.begin(115200);
  BeginQuadroControl("Quadrocopter");
}

void loop() {
  Serial.printf("%f | %f | %f | %f \n\r", GetXTarget(), GetYTarget(), GetTargetPower(), GetTargetRotation());
  delay(100);
}