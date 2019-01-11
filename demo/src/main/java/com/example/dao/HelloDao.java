package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by TC20021 on 2018/10/25.
 */
@Repository
public class HelloDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int update(){
        String sql="update zwl_test01 set name = ? where id = ? ";
        Object[] params=new Object[]{"张三丰",11};

        return jdbcTemplate.update(sql,params);
    }

    public List queryList(){
        String sql="select id,name from zwl_test01 where id = ? ";
        Object[] params=new Object[]{11};

        return jdbcTemplate.queryForList(sql,params);
    }
}
