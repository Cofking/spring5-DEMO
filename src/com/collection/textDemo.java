package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class textDemo {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean6.xml");

        Book sttu = context.getBean("book", Book.class);
        System.out.println(sttu);
    }
}
