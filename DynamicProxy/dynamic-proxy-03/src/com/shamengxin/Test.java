package com.shamengxin;


import com.shamengxin.factory.UsbKingImpl;
import com.shamengxin.handler.UtilHander;
import com.shamengxin.service.UsbShell;

//改进
public class Test {
    public static void main(String[] args) {

        UsbShell factory=new UsbKingImpl();

        UsbShell proxy= (UsbShell) UtilHander.creat(factory);

        float price = proxy.sell(1);
        System.out.println("通过动态代理对象，调用方法："+price);
    }
}
