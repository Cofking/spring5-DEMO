package com.注解;

import com.注解.Controller.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {


//        ApplicationContext context=new ClassPathXmlApplicationContext("bean11.xml");
//        UserService userService = context.getBean("userService", UserService.class);
//        userService.add();

        ApplicationContext context1=new AnnotationConfigApplicationContext(SpringConfig.class);
        SpringConfig sp=context1.getBean("springConfig",SpringConfig.class);
        sp.abc();


    }
}
