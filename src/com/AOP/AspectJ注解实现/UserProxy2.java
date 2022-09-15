package com.AOP.AspectJ注解实现;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Order(1) //多个增强类增强同一个方法 优先级 数字越小 增强类优先级越高

@Component
@Aspect
public class UserProxy2 {



    @Before(("execution(* com.AOP.AspectJ注解实现.User.add(..))"))
    public  void  berfor(){
        System.out.println("多个增强类增强同一个方法 优先级");
    }
}
