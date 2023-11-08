package com.example.aliyun_mqtt;

import java.text.DecimalFormat;

public class NumberConvertUtil {
    public static String formatDouble(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00"); // 保留两位小数的格式
        return decimalFormat.format(value);
    }

    public static String formatOneDouble(double value) {
        DecimalFormat decimalFormat;

        // 获取数值的小数部分
        double fractionalPart = value - (int) value;

        // 如果小数部分为零，则保留一位小数；否则保留所有小数位
        if (Math.abs(fractionalPart) < 1E-10) { // 使用一个很小的阈值判断小数部分是否为零
            decimalFormat = new DecimalFormat("0.0");
        } else {
            decimalFormat = new DecimalFormat("0.#######"); // 最多保留小数点后 n 位#####################
        }

        return decimalFormat.format(value);
    }

    public static String formatFloat(float value) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00"); // 保留两位小数的格式
        return decimalFormat.format(value);
    }

}
