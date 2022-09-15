package com.注解.Service;

import com.注解.Dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


//注解里的value可以不写 如果不写 默认是类名称  首字母小写

@Service(value = "userService") //bean id="userService" class=""
public class UserService {

    //不需要设置set方法注解实现了
//    @Autowired //根据类型注入
//    @Qualifier(value = "daoImpl1")//更具属性名称注入 使用@Qualifier需要和 @Autowired 一起使用
//    private Dao dao;


    //JDK11以上没有该方法
    //@Resource  //默认根据类型注入
    @Resource(name = "daoImpl1")  //根据名称注入
    private Dao dao;

//    @Value("123")//注入普通属性
    @Value("${username}")//配置文件配置之后可以动态获取值
    private  String name;
    public void add(){
        System.out.println("Service  add..");
        dao.add();
        System.out.println(name);
    }
}
