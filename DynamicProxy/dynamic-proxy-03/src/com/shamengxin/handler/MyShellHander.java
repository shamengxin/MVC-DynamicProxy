package com.shamengxin.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//必须实现InvocationHandler接口，完成代理类要做的功能（1.执行目标方法，2.功能增强）
public class MyShellHander implements InvocationHandler {
    private Object target=null;

    //动态代理：目标对象是活动的，不是固定的，目标对象需要传入进来
    //创建传入对象的代理对象
    public MyShellHander(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object res=null;
        //向厂家发送订单，告诉厂家，我需要多少U盘
        // float price = factory.sell(amount);//厂家返回的价格

        //注：method代表的是你要执行的那个方法，当使用者在掉用目标类方法时，目标类的方法名称会赋值给method
        //此时method指代的就是目标类的方法，target是指定那个目标类。
        res=method.invoke(target,args);

        //商家也是需要挣钱的，所以商家会进行加价
        //这里就是功能增强，代理类在完成了目标类方法之后，增加了额外的功能
        //price=price+25;
        if(res!=null){
            Float price=(Float) res;
            price=price+25;
            res=price;
        }

        //只要是除目标类方法的其他功能，都是属于功能增强
        System.out.println("淘宝商家，给你返一个额外的优惠卷");


        //把加价之后的价格返回给购买者
        return res;
    }
}
