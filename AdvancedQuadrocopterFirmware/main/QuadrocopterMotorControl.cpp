#include "QuadrocopterMotorControl.h"

MotorControl::MotorControl(){
    xTarget=127;
    yTarget=127;
    rotationTarget=127;
    powerTarget=127;

    ledc_timer_config_t ledc_timer = {
    .speed_mode       = LEDC_HIGH_SPEED_MODE,  // High-speed mode
    .duty_resolution  = LEDC_TIMER_8_BIT,     // Set duty resolution to 13 bits
    .timer_num        = LEDC_TIMER_0,          // Use timer 0
    .freq_hz          = PWM_FREQ,             // PWM frequency: 5 kHz
    .clk_cfg          = LEDC_AUTO_CLK        // Auto-select clock source
    };
    ledc_timer_config(&ledc_timer);

    MotorChannel1 = {
            .gpio_num   = Motor1GPIO,
            .speed_mode = LEDC_HIGH_SPEED_MODE,
            .channel    = Motor1Channel,  // Assign unique channel
            .timer_sel  = LEDC_TIMER_0,        // Use timer 0
            .duty       = 0,                   // Start with 0 duty
            .hpoint     = 0
        };
    MotorChannel2 = {
            .gpio_num   = Motor2GPIO,
            .speed_mode = LEDC_HIGH_SPEED_MODE,
            .channel    = Motor2Channel,  // Assign unique channel
            .timer_sel  = LEDC_TIMER_0,        // Use timer 0
            .duty       = 0,                   // Start with 0 duty
            .hpoint     = 0
        };
    MotorChannel3 = {
            .gpio_num   = Motor3GPIO,
            .speed_mode = LEDC_HIGH_SPEED_MODE,
            .channel    = Motor3Channel,  // Assign unique channel
            .timer_sel  = LEDC_TIMER_0,        // Use timer 0
            .duty       = 0,                   // Start with 0 duty
            .hpoint     = 0
        };
    MotorChannel4 = {
            .gpio_num   = Motor4GPIO,
            .speed_mode = LEDC_HIGH_SPEED_MODE,
            .channel    = Motor4Channel,  // Assign unique channel
            .timer_sel  = LEDC_TIMER_0,        // Use timer 0
            .duty       = 0,                   // Start with 0 duty
            .hpoint     = 0
        };
    ledc_channel_config(&MotorChannel1);
    ledc_channel_config(&MotorChannel2);
    ledc_channel_config(&MotorChannel3);
    ledc_channel_config(&MotorChannel4);
}

void MotorControl::SetXTarget(unsigned char val){
    xTarget=val;
}
void MotorControl::SetYTarget(unsigned char val){
    yTarget=val;
}
void MotorControl::SetRotationTarget(unsigned char val){
    rotationTarget=val;
}
void MotorControl::SetPowerTarget(unsigned char val){
   powerTarget=val;
}
void MotorControl::Refresh(){
    ledc_set_duty(LEDC_HIGH_SPEED_MODE, MotorChannel1.channel, xTarget);
    ledc_set_duty(LEDC_HIGH_SPEED_MODE, MotorChannel2.channel, yTarget);
    ledc_set_duty(LEDC_HIGH_SPEED_MODE, MotorChannel3.channel, rotationTarget);
    ledc_set_duty(LEDC_HIGH_SPEED_MODE, MotorChannel4.channel, powerTarget);
    ledc_update_duty(LEDC_HIGH_SPEED_MODE, MotorChannel1.channel);
    ledc_update_duty(LEDC_HIGH_SPEED_MODE, MotorChannel2.channel);
    ledc_update_duty(LEDC_HIGH_SPEED_MODE, MotorChannel3.channel);
    ledc_update_duty(LEDC_HIGH_SPEED_MODE, MotorChannel4.channel);
}