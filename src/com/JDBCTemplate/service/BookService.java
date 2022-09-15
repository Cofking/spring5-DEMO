package com.JDBCTemplate.service;


import com.JDBCTemplate.DAO.BookImpl;

import com.JDBCTemplate.bean.one;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {


    //注入dao
    @Autowired
    public BookImpl BookImpl;


    public  void add(one one){
    BookImpl.add(one);

    }

    public  void select(){
        System.out.println( BookImpl.select());

    }
    public  void selectObject(String a){
        System.out.println( BookImpl.selectObject(a));

    }
    public List<one> selectList(){
       return BookImpl.selectList();
    }

}
