idf_component_register( SRCS "main.cpp"
                        SRCS "QuadrocopterBTCtrl.cpp"
                        SRCS "QuadrocopterMotorControl.cpp"
                        PRIV_REQUIRES bt nvs_flash esp_driver_uart esp_driver_ledc
                        REQUIRES esp_driver_gpio
                        INCLUDE_DIRS ".")
