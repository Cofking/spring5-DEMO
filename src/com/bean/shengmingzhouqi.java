package com.bean;

public class shengmingzhouqi {
    private  String name;

    @Override
    public String toString() {
        return "shengmingzhouqi{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        System.out.println("第二步 set注入");
        this.name = name;
    }

    public shengmingzhouqi() {
        System.out.println("第一步 创建bean对象");
    }

    public void initMeth(){
        System.out.println("第三部 初始化方法");
    }
  public void destroyMeth(){
      System.out.println("第五步 销毁bean");
  }

}
