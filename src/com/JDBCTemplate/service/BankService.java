package com.JDBCTemplate.service;

import com.JDBCTemplate.DAO.BanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



//开启事务注解  在类上声明或者方法上声明
//传播行为 属性 propagation     事务 指 方法中有对数据库数据的改变 的控制
// REQUIRED 支持当前事务，如果当前没有事务，就新建一个事务
//隔离级别 isolation  REPEATABLE_READ 可重复读  mysql默认
//超时时间 timeout  事务在一定时间内提交，如果不提交 就回滚 默认-1 不超时 ，秒为单位
//只读 readOnly 默认值 false
//rollbackFor   设置哪些异常进行回滚
//norollbackFor  设置哪些异常不进行回滚
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = 10)
@Service
public class BankService {

    @Autowired
    BanImpl ban;


    public void money(){


        ban.Bankupdate("100");

        int i= 10/0;
        ban.Bankupdate1("100");




    }

}
