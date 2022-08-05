package com.example.dockerDemo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ItemRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertItem() {
        String sql = "insert into item (item_name) values (?)";
        jdbcTemplate.update(sql, "docker begin");
    }

    public List<Map<String, Object>> getAllItem(){
        String sql = "select * from item";
        return jdbcTemplate.queryForList(sql);
    }
}
