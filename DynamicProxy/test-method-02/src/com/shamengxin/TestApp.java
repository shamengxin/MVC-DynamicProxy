package com.shamengxin;

import com.shamengxin.impl.HelloServiceImpl;
import com.shamengxin.impl.HelloServiceImpl2;
import com.shamengxin.service.HelloService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // HelloService service=new HelloServiceImpl();
        // service.sayHello("张三");

        //使用反射机制执行sayHello方法。核心Method（类中的方法）
        HelloService target=new HelloServiceImpl();
        //获取sayHello名称对于的Method类对象
        Method method = HelloService.class.getMethod("sayHello", String.class);
        //下面通过method可以执行sayhello方法
        /*
            invoke是Method类中的一个方法。表示执行方法的调用。
            参数：
                1.Object，指定要执行这个方法的对象
                注：这个执行这个方法的对象一定继承了上面注册方法的接口，如 ：HelloService
                2.Object... args，方法执行时的参数
            返回值:
                Object:方法执行后的返回值
        */
        //表达的意思就是 执行target对象sayHello，参数是lisi

        HelloService service=new HelloServiceImpl2();
        Object ret = method.invoke(service, "lisi");
    }
}
