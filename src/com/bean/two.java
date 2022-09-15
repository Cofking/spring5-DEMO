package com.bean;
//内部bean
public class two {
    private  String name;
    private  String code;
    private  one    Oname;

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public one getOname() {
        return Oname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOname(one oname) {
        Oname = oname;
    }
    public  void  add(){
        System.out.println(name+"=="+code+"===="+Oname);
    }
}
