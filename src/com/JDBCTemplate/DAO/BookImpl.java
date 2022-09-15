package com.JDBCTemplate.DAO;

import com.JDBCTemplate.bean.one;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookImpl implements  Book{

    //注入JDBCTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(one obj) {
        int update = jdbcTemplate.update("insert into one.one value (?,?,?)", obj.getName(), obj
                .getAge(), obj.getSex());
        System.out.println(update);



    }


    //queryForObject 返回某个值
    @Override
    public int select() {
        Integer integer = jdbcTemplate.queryForObject("select count(*) from one.one", Integer.class);

        return  integer;
    }

    //queryForObject 返回对象

    @Override
    public one selectObject(String a) {
        String sql="select * from one.one where name=?";
        one one = jdbcTemplate.queryForObject(
                sql,//sql语句
                new BeanPropertyRowMapper<one>(one.class), //返回的类型
                a//sql语句中占位符的值
        );

        return one;
    }


    //返回集合
    @Override
    public List<one> selectList() {

        List<one> query = jdbcTemplate.query("select * from one.one", new BeanPropertyRowMapper<one>(one.class));
        return query;
    }

    //批量添加/修改/删除   batchUpdata  传入 sql语句  对象数据数组


}
