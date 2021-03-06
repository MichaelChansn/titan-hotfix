package com.baidu.titan.sample.titantest;

import android.util.Log;

/**
 * 用于测试方法override的子类
 *
 * @author shanghuibo
 * @since 2019/02/13
 */
public class Truck extends Car {
    /** debug tag */
    public static final String TAG = "TitanTest";

    /**
     * 测试方法
     */
    public void testOverride() {
        Log.d(TAG, "Truck wheel count = " + getWheelCount());
    }

    /**
     * 新增了Override方法
     *
     * @return 返回子类中规定的车轮数
     */
    @Override
    public int getWheelCount() {
        return 6;
    }
}
