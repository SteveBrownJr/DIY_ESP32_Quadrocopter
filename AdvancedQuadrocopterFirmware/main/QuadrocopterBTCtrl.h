#ifndef QUADROCOPTER_BT_CTRL
#define QUADROCOPTER_BT_CTRL

#include "esp_bt.h"
#include "esp_bt_main.h"
#include "esp_gap_bt_api.h"
#include "esp_bt_device.h"
#include "esp_spp_api.h"


#define DEVICE_NAME "Quadrocopter"
#define SPP_SERVER_NAME "Quadrocopter_SPP"


class QuadrocopterBTCtrl{
private:
    static unsigned char xTarget;
    static unsigned char yTarget;
    static unsigned char rotationTarget;
    static unsigned char powerTarget;
    static void esp_spp_cb(esp_spp_cb_event_t event, esp_spp_cb_param_t *param);
    bool Initialized;
public:
    QuadrocopterBTCtrl();
    bool isInitialized();
    unsigned char getXTarget();
    unsigned char getYTarget();
    unsigned char getRotationTarget();
    unsigned char getPowerTarget();
};

#endif