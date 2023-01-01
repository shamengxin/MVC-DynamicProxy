package com.shamengxin.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//改进
public class UtilHander {
    private UtilHander() {
    }
    public static Object creat(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                Object res = null;

                res = method.invoke(target, args);

                if (res != null) {
                    Float price = (Float) res;
                    price = price + 25;
                    res = price;
                }

                //只要是除目标类方法的其他功能，都是属于功能增强
                System.out.println("淘宝商家，给你返一个额外的优惠卷");


                //把加价之后的价格返回给购买者
                return res;
            }
        });
    }
}
