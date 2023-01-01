package com.shamengxin.shangjia;

import com.shamengxin.factory.UsbKingImpl;
import com.shamengxin.factory.UsbSanImpl;
import com.shamengxin.service.UsbShell;

public class TaoBaoSanDi implements UsbShell {
    //声明 商家代理的厂家具体是谁
    private UsbShell factory=new UsbSanImpl();

    @Override
    //实现销售U盘的功能
    public float sell(int amount) {

        //向厂家发送订单，告诉厂家，我需要多少U盘
        float price = factory.sell(amount);//厂家返回的价格

        //商家也是需要挣钱的，所以商家会进行加价
        //这里就是功能增强，代理类在完成了目标类方法之后，增加了额外的功能
        price=price+25;
        //只要是除目标类方法的其他功能，都是属于功能增强
        System.out.println("淘宝商家，给你返一个额外的优惠卷");


        //把加价之后的价格返回给购买者
        return price;

    }
}
