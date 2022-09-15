package com.AOP.JDK;

public class UserImpl implements User{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int update(int a) {
        return a;
    }
}
