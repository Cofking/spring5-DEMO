package com.AOP.AspectJ注解实现;

import org.springframework.stereotype.Component;
//生成被增强类的对象
@Component("one")

public class User {


    public void add(int i,int b){
        //测试异常通知
//        int i=10/0;
        System.out.println("add...."+i+b);
    }
}
