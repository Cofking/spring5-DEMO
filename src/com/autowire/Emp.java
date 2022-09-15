package com.autowire;

public class Emp {
    private  dept Depta;

    public void setDept(dept dept) {
        Depta = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "Dept=" + Depta +
                '}';
    }
}
