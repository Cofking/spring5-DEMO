package com.Factorybean;

import org.springframework.beans.factory.FactoryBean;
import com.collection.course;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

//工厂bean
public class mybean  implements FactoryBean<course> {

    //自定义返回bean类型
    @Override
    public course getObject() throws Exception {
        //底层是反射创建实例
       Class clazz=Class.forName("com.collection.course");

        Constructor constructor = clazz.getConstructor();

        course c = (course) constructor.newInstance();

        Method setCname = clazz.getMethod("setCname", String.class);
        // course c=new course();
//        setCname.invoke(c,"123");
        return  c;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
