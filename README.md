# Aliyun MQTT Android Application

This repository provides an Android application that connects to Alibaba Cloud's IoT MQTT service. The app receives data from an ESP32-S3 based device and displays the information on a Google Map. Example Arduino firmware is also provided to help you send sensor readings (GPS, distance, etc.) to the cloud.

## Getting Started with Android Studio

1. Install [Android Studio](https://developer.android.com/studio?hl=en) if you haven't already.
2. Open Android Studio and choose **Get from VCS**.
3. Enter the following repository URL and clone the project to a path without Chinese characters:

   `https://github.com/lukeyu1025/aliyun_mqtt.git`
4. Once the project is imported you can build and run it from Android Studio.

## Building and Testing with Gradle

From the project directory you can run:

```bash
./gradlew build
./gradlew test
```

## Current Status

1. Initial Traditional Chinese localization for the UI.
2. Partial implementation of map features.

### Known Issues

1. The map does not always display coordinates correctly.
2. You can refer to [this demo](https://github.com/lukeyu1025/My_Application.git) to troubleshoot the map issue. It uses fixed coordinates but still fails to display properly.

## Using the Arduino IDE

1. [Download the Arduino code](https://github.com/lukeyu1025/grad_project_arduino.git) and modify the `wifiname` and `wifipassword` if needed.
2. In the Arduino IDE select **Sketch → Include Library → Add .ZIP Library** and add [the required ZIP file](https://drive.google.com/drive/folders/13STSmsaVkMZMrOnQPTcPOoKlixBiJ3B0?usp=sharing).
3. Choose the correct board and port.
4. Open the Serial Monitor at 115200 baud to view serial output.

## Notes

### Important Android Files

1. [AndroidManifest.xml](app/src/main/AndroidManifest.xml)
   - Declares the UI components and their Java files
   - Contains API keys and permissions
2. [MainActivity.java](app/src/main/java/com/example/aliyun_mqtt/MainActivity.java) – main activity logic
3. [activity_main.xml](app/src/main/res/layout/activity_main.xml) – main UI layout
4. [AliyunIoTSignUtil.java](app/src/main/java/com/example/aliyun_mqtt/AliyunIoTSignUtil.java) – client device authentication helper
5. [NumberConvertUtil.java](app/src/main/java/com/example/aliyun_mqtt/NumberConvertUtil.java) – formats floating point numbers to two decimal places

## Screenshots

![App Screenshot](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/3d4abcf7-1d2e-478b-832d-228847515d9c)

## Circuit Diagram

![Circuit Diagram](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/05bd4b87-a152-43c6-9f0b-be84c57c6573)

## Components

1. **Board:** ESP32-S3
   ![ESP32-S3](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/07170907-84ac-4518-922b-6bccf5cb4afe)
2. **6-Axis Accel & Gyro Sensor:** MPU6050
   ![MPU6050](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/19846bf0-3e2c-41a1-aa43-b7c62f292ee8)
3. **Passive Buzzer Module**
   ![Buzzer](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/b8a4919f-8bdc-4d00-9761-de6a885b65d2)
4. **GPS Module Receiver:** GT-U7
   ![GT-U7](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/d13c9c77-c50f-4c68-91eb-666046db5f90)
5. **Ultrasonic Distance Sensor:** HC-SR04
   ![HC-SR04](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/7a12d8db-a872-4dd2-bfe6-60e51e008e18)

## License

This project is licensed under the terms of the [MIT License](LICENSE).
