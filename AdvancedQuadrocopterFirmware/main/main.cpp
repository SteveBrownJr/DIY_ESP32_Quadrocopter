#include <stdint.h>
#include <string.h>
#include <stdbool.h>
#include <stdio.h>
#include <inttypes.h>
#include "nvs.h"
#include "nvs_flash.h"
#include "freertos/FreeRTOS.h"
#include "freertos/task.h"
#include "esp_log.h"

#include "time.h"
#include "sys/time.h"

#include "QuadrocopterBTCtrl.h"
#include "QuadrocopterMotorControl.h"

extern "C"{
	void app_main(void)
	{
		esp_err_t ret = ESP_OK;
		ret = nvs_flash_init();
		if (ret == ESP_ERR_NVS_NO_FREE_PAGES || ret == ESP_ERR_NVS_NEW_VERSION_FOUND) {
			ESP_ERROR_CHECK(nvs_flash_erase());
			ret = nvs_flash_init();
		}
		ESP_ERROR_CHECK( ret );

		QuadrocopterBTCtrl BTCtrl;
		MotorControl MTRCtrl;
		while(true){
			MTRCtrl.SetPowerTarget(BTCtrl.getPowerTarget());
			MTRCtrl.SetRotationTarget(BTCtrl.getRotationTarget());
			MTRCtrl.SetXTarget(BTCtrl.getXTarget());
			MTRCtrl.SetYTarget(BTCtrl.getYTarget());
			MTRCtrl.Refresh();
		}
	}
}
