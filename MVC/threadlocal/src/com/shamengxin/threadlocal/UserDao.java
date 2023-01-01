package com.shamengxin.threadlocal;

public class UserDao {

    public void  insert(){
        Thread thread=Thread.currentThread();
        System.out.println(thread);

        Connection conn = DBUtil.getConnection();
        System.out.println(conn);

        System.out.println("USer Dao insert");
    }

}
