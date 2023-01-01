package com.shamengxin.threadlocal;

public class UserService {

    private UserDao userDao=new UserDao();

    public void save(){
        Thread thread=Thread.currentThread();
        System.out.println(thread);

        Connection conn = DBUtil.getConnection();
        System.out.println(conn);

        userDao.insert();
    }

}
