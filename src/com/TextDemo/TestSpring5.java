package com.TextDemo;


import com.bean.two;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void textAdd() {

        /**
         * 基于  XML
         */


        //加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");//配置文件必须在src根目录下
//         BeanFactory context2=new FileSystemXmlApplicationContext("src/bean1.xml");//文件路径字符串
        //获取配置创建的对象   //bean 的id
        two bean = context.getBean("two", two.class);//XML配置创建 默认执行无参构造方法完成创建对象  没有无参就会报错

            bean.add();
        //基于XML
        //ID：依赖注入 ，就是设置属性
        //1：set方法设置属性  2： 有参构造方法设置属性

        //xml注入其他类型属性
        //注入属性-外部bean
        //注入属性-内部bean
    }

}
