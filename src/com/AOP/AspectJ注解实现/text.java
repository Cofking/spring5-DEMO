package com.AOP.AspectJ注解实现;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    @Test
    public static void main(String[] args) {

        //基于配置文件的AOP
//        ApplicationContext context=new ClassPathXmlApplicationContext("bean12.xml");
//        User one = context.getBean("one", User.class);
//        one.add(1,2);

        //全注解AOP
        ApplicationContext context=new AnnotationConfigApplicationContext(AOPConfig.class);
        User one = context.getBean( User.class);
        one.add(1,2);


    }
}
/*
*
环绕通知前
前置通知
add....
后置通知
最终通知
环绕通知后
*

环绕通知前
前置通知
异常通知
最终通知
*
* */