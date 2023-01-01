package com.shamengxin;

import com.shamengxin.factory.UsbKingImpl;
import com.shamengxin.handler.MyShellHander;
import com.shamengxin.service.UsbShell;

import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        //创建代理对象，使用Proxy
        //1.创建目标对象
        UsbShell factory=new UsbKingImpl();

        //2.创建InvocationHandler对象
        MyShellHander handler = new MyShellHander(factory);

        //3.创建代理对象
        UsbShell proxy =(UsbShell) Proxy.newProxyInstance(factory.getClass().getClassLoader()
                        , factory.getClass().getInterfaces(), handler);

        //4.通过代理执行方法
        //因为proxy被强转为UsbShell对象，所以proxy会有sell方法
        float price = proxy.sell(1);
        System.out.println("通过动态代理对象，调用方法："+price);
    }
}
