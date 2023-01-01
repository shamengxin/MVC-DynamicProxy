package com.shamengxin.service;

//表示功能的，厂家，商家都要完成的功能
public interface UsbShell {

    //定义方法 参数 amount：表示一次购买数量，暂时不用
    //返回值表示一个U盘的价格
    float sell(int amount);

    //可以有多个其他方法
    //void print();
}
