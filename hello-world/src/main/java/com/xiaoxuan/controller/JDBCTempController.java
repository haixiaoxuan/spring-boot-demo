package com.xiaoxuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/28.
 */
@Controller
public class JDBCTempController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/query")
    public String query(){
        List<Map<String, Object>> res = jdbcTemplate.queryForList("select * from DBS");

        return "xx";
    }
}
