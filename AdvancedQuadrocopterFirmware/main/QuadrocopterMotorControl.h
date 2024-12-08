#ifndef QUADROCOPTER_MOTOR_CTRL
#define QUADROCOPTER_MOTOR_CTRL

#include "driver/ledc.h"

#define PWM_FREQ 1000
#define PWM_RESOLUTION LEDC_TIMER_8_BIT


#define Motor1GPIO 4
#define Motor2GPIO 16
#define Motor3GPIO 17
#define Motor4GPIO 18
#define Motor1Channel (LEDC_CHANNEL_0)
#define Motor2Channel (LEDC_CHANNEL_1)
#define Motor3Channel (LEDC_CHANNEL_2)
#define Motor4Channel (LEDC_CHANNEL_3)


class MotorControl{
    private:
    unsigned char xTarget;
    unsigned char yTarget;
    unsigned char rotationTarget;
    unsigned char powerTarget;
    ledc_channel_config_t MotorChannel1;
    ledc_channel_config_t MotorChannel2;
    ledc_channel_config_t MotorChannel3;
    ledc_channel_config_t MotorChannel4;
    public:
    MotorControl();
    void SetXTarget(unsigned char val);
    void SetYTarget(unsigned char val);
    void SetRotationTarget(unsigned char val);
    void SetPowerTarget(unsigned char val);
    void Refresh();
};

#endif