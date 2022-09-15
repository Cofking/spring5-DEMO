package com.JDBCTemplate;

import com.JDBCTemplate.bean.one;
import com.JDBCTemplate.service.BankService;
import com.JDBCTemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void testADD() {

//        ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");
//        BookService bookService = context.getBean("bookService", BookService.class);
////        bookService.add(new one("JdbC",18,"男"));
////        bookService.select();
//        //bookService.selectObject("孙悟空");
//        System.out.println(bookService.selectList());


        ApplicationContext context = new ClassPathXmlApplicationContext("bean10.xml");
        BankService bankService = context.getBean("bankService", BankService.class);
        bankService.money();

    }
}
