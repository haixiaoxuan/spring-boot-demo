package com.xiaoxuan.controller;

import com.xiaoxuan.mapper.DBMapper;
import com.xiaoxuan.model.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/28.
 */
@Controller
public class TestController {

    @Autowired
    private DBMapper dbMapper;


    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }


    @RequestMapping("/selectById")
    public String selectById(){
        DB db = dbMapper.selectById(1);
        System.out.println(db);
        return db.toString();
    }

    @RequestMapping("/selectAll")
    public String selectAll(){
        List<DB> res = dbMapper.selectAll();
        System.out.println(res);
        return "success";
    }
}
