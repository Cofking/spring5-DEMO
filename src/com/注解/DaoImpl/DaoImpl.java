package com.注解.DaoImpl;

import com.注解.Dao.Dao;
import org.springframework.stereotype.Repository;

@Repository(value = "daoImpl1")
public class DaoImpl implements Dao {

    @Override
    public void add() {
        System.out.println("dao add...");
    }
}
