package com.example.aliyun_mqtt;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void formatDouble_shouldFormatToTwoDecimalPlaces() {
        assertEquals("2.00", NumberConvertUtil.formatDouble(2));
        assertEquals("2.35", NumberConvertUtil.formatDouble(2.345));
    }

    @Test
    public void formatOneDouble_shouldTrimTrailingZeros() {
        assertEquals("2.0", NumberConvertUtil.formatOneDouble(2.0));
        assertEquals("2.5", NumberConvertUtil.formatOneDouble(2.5));
    }

    @Test
    public void formatFloat_shouldFormatToTwoDecimalPlaces() {
        assertEquals("2.00", NumberConvertUtil.formatFloat(2f));
        assertEquals("2.35", NumberConvertUtil.formatFloat(2.345f));
    }
}