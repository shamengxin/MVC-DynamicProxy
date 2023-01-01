package com.shamengxin.factory;

import com.shamengxin.service.UsbShell;

//目标类
public class UsbKingImpl implements UsbShell {
    @Override
    public float sell(int amount) {
        //目标方法
        System.out.println("目标类中，执行shell方法");
        return 85.0f;
    }
}
