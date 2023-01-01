package com.shamengxin.shangjia;

import com.shamengxin.factory.UsbKingImpl;
import com.shamengxin.factory.UsbSanImpl;
import com.shamengxin.service.UsbShell;

public class WeiShangSanDi implements UsbShell {
    private UsbSanImpl factory=new UsbSanImpl();
    @Override
    public float sell(int amount) {
        //调用目标类方法
        float price = factory.sell(amount);
        //只增加一元
        price=price+1;
        return price;
    }
}
