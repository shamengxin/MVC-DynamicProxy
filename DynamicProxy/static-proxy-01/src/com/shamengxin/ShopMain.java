package com.shamengxin;

import com.shamengxin.shangjia.TaoBao;
import com.shamengxin.shangjia.WeiShang;

//消费者
public class ShopMain {
    public static void main(String[] args) {
        //寻找商家/代理者去购买货物
        /*TaoBao taoBao=new TaoBao();
        //通过代理类，实现l购买U盘，还添加了赠送优惠卷等额外的功能
        float price=taoBao.sell(1);
        System.out.println("通过淘宝的商家，购买U盘的单价："+price);*/

        WeiShang weiShang=new WeiShang();
        float price = weiShang.sell(1);
        System.out.println("通过微商的商家，购买U盘的单价："+price);
    }
}
