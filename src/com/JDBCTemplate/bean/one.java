package com.JDBCTemplate.bean;

import java.util.List;

public class one {
    private   String name;
    private  int age;
    private  String sex;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "one{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public one(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public one() {

    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
