package com.shamengxin.shangjia;

import com.shamengxin.factory.UsbKingImpl;
import com.shamengxin.service.UsbShell;

public class WeiShang implements UsbShell {
    //代理的是 金士顿，定义目标厂家类
    private UsbKingImpl factory=new UsbKingImpl();
    @Override
    public float sell(int amount) {
        //调用目标类方法
        float price = factory.sell(amount);
        //只增加一元
        price=price+1;
        return price;
    }
}
