package com.bean;

import org.springframework.context.ApplicationContext;
import com.bean.shengmingzhouqi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class shengmingzhouqiDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean8.xml");
        shengmingzhouqi shengmingzhouqi1 = context.getBean("shengmingzhouqi1", shengmingzhouqi.class);
        System.out.println("第四步 使用 bean ");

        System.out.println(shengmingzhouqi1.toString());
        ((ClassPathXmlApplicationContext) context).close();//ApplicationContext接口中没有其实现类中的方法 需要转换成实现类调用销毁方法

    }
}
