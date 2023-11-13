# Aliyun MQTT Android Studio 教學

這個教學將指導您如何在 Android Studio 中下載並使用 Aliyun MQTT 程式庫。請跟隨以下步驟進行操作：

## 步驟 1：下載 Android Studio

首先，請確保您已經下載並安裝了 Android Studio，如果還沒有，您可以在以下連結下載：

[下載 Android Studio](https://developer.android.com/studio?hl=zh-tw)

## 步驟 2：從版本控制系統獲取專案

在開啟 Android Studio 後，請執行以下步驟：

1. 點擊 "Get from VCS" 選項。

![Get from VCS](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/15b58c81-d1b4-47a9-b27f-77df2655558e)

2. 在 URL 輸入框中，輸入以下專案的 GitHub 存儲庫 URL：


![GitHub URL](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/ebbf10c9-d719-473c-917e-2e2614e26ee5)

3. 請確保選擇一個不包含中文字符的路徑作為專案的存放位置。

[Git URL](https://github.com/lukeyu1025/aliyun_mqtt.git)

現在，您已經成功將 Aliyun MQTT 專案複製到您的 Android Studio 中，可以開始編輯和運行代碼了。

希望這個教學對您有所幫助！如果您有任何問題或需要進一步的協助，請隨時聯絡我們。

## 已經完成的部分

1. UI介面初步繁體化

2. map功能新增(部分)

## 需要修訂的部分

1.無法正常使用座標顯示在map上

2.可以用[這個](https://github.com/lukeyu1025/My_Application.git)我做到一半的map DEMO版程式去試試看問題在哪裡，這個程式是以一個固定座標去嘗試，然而依然無法正常顯示

# Arduino Ide 使用

1. [下載 Arduino code](https://github.com/lukeyu1025/grad_project_arduino.git)，wifiname 以及 wifipassword是我自己的(如有需要請自行更改)

2. 在 Sketch -> include library -> add .Zip library 依序新增 [下載 .zip 檔案](https://drive.google.com/drive/folders/13STSmsaVkMZMrOnQPTcPOoKlixBiJ3B0?usp=sharing)
![image](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/7c239646-3d42-4795-be74-9872b10920ac)
3. 選擇正確的 port 以及 board</br>
![image](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/6fe07410-ae00-48be-91bd-b7a2e4a01fc8)
4. Serial Monitor 選擇 115200 baud 以查看 Serial


# 備註!!!

## anroid app 重要檔案索引位置
1. [AndroidManifest.xml](app/src/main/AndroidManifest.xml):
    用來設定使用到的ui及他的java檔
    設定API keys
    設定permission
2. [MainActivity.java](app/src/main/java/com/example/aliyun_mqtt/MainActivity.java):
    main的java檔
3. [activity_main.xml](app/src/main/res/layout/activity_main.xml):
    main的xml(UI)檔
    
4. [AliyunIoTSignUtil.java還沒研究](app/src/main/java/com/example/aliyun_mqtt/AliyunIoTSignUtil.java) 用來對客戶端設備進行身份驗證。驗證客戶端設備是否有權訪問該MQTT代理。ref：https://developer.aliyun.com/article/775935
 
5. [NumberConvertUtil.java還沒研究](app/src/main/java/com/example/aliyun_mqtt/NumberConvertUtil.java)

# 實機畫面
![螢幕擷取畫面 2023-11-13 190206](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/3d4abcf7-1d2e-478b-832d-228847515d9c)
# 電路圖
![未命名](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/05bd4b87-a152-43c6-9f0b-be84c57c6573)
# 元件
1. board: esp32-s3</br>
![image](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/07170907-84ac-4518-922b-6bccf5cb4afe)
2. 6-Axis Accel & Gyro Sensor: mpu6050</br>
![image](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/19846bf0-3e2c-41a1-aa43-b7c62f292ee8)
3. passive buzzer module </br>
![image](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/b8a4919f-8bdc-4d00-9761-de6a885b65d2)
4. GPS Module Receiver: GT-U7 </br>
![螢幕擷取畫面 2023-11-13 200740](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/d13c9c77-c50f-4c68-91eb-666046db5f90)
5. Ultrasonic Distance Sensor: HC-SR04 </br>
![image](https://github.com/lukeyu1025/aliyun_mqtt/assets/74660025/7a12d8db-a872-4dd2-bfe6-60e51e008e18)
