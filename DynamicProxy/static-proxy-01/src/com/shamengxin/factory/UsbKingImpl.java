package com.shamengxin.factory;

import com.shamengxin.service.UsbShell;

//目标类：金士顿厂家————UsbShell的实现类
//注：不接受用户的单独购买
public class UsbKingImpl implements UsbShell {

    @Override
    public float sell(int amount) {
        System.out.println("目标类中的方法带哦用，shell方法执行");
        //一个128G的U盘是85元
        //后期根据amount，可以实现不同的价格，例如10000个，单价是80，50000个，单价是75
        return 85.0f;
    }
}
