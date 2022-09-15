package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImol;
//注入外部bean
public class UserService {

    //创建UserDao类型属性 生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void add(){
        System.out.println("Service add....");
        userDao.delete();
        //service 层中调用dao层SQL方法
        //原始方式
//        UserDao ud=new UserDaoImol();
//        ud.delete();

    }

    public static void main(String[] args) {
        UserService us=new UserService();
        us.add();
    }
}
