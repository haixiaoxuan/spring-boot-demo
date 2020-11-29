package com.xiaoxuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/28.
 */
@Controller
public class DataSourceTestController {


    @Autowired
    private DataSource dataSource;


    @RequestMapping("/test")
    public String test(){
        System.out.println(dataSource);
        return "hello DataSource";
    }

}
