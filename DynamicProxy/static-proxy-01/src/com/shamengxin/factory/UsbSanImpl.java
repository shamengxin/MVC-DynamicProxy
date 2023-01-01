package com.shamengxin.factory;

import com.shamengxin.service.UsbShell;

//目标类：闪迪厂家，不接受消费者的单独购买
public class UsbSanImpl implements UsbShell {
    @Override
    public float sell(int amount) {
        System.out.println("闪迪 目标类中的方法带哦用，shell方法执行");
        //一个128G的U盘是85元
        //后期根据amount，可以实现不同的价格，例如10000个，单价是80，50000个，单价是75
        return 85.0f;
    }
}
