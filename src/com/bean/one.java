package com.bean;

public class one {
    private String Oname;

    public void setOname(String oname) {
        Oname = oname;
    }

    public String getOname() {
        return Oname;
    }

    @Override
    public String toString() {
        return "one{" +
                "Oname='" + Oname + '\'' +
                '}';
    }
}
