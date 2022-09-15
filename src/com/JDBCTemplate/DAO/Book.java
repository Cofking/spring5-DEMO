package com.JDBCTemplate.DAO;

import com.JDBCTemplate.bean.one;

import java.util.List;

public interface Book {
    public  void  add(one obj);
    public  int  select();
    public  one selectObject(String a);
    public List<one> selectList();
}
