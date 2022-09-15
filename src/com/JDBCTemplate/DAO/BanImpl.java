package com.JDBCTemplate.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BanImpl implements Bank{

    @Autowired
    JdbcTemplate  jdbcTemplate;

    @Override
    public void Bankupdate(String a) {

        String sql="update one.bank set money =money-? where name=?";
        jdbcTemplate.update(sql,a,"a");

    }

    @Override
    public void Bankupdate1(String a) {

        String sql="update one.bank set money =money+? where name=?";
        jdbcTemplate.update(sql,a,"b");

    }
}
