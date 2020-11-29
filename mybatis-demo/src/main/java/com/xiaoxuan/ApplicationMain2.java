package com.xiaoxuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/28.
 */

@SpringBootApplication
//@MapperScan("com.xiaoxuan.mapper")
public class ApplicationMain2 {

    public static void main(String[] args){

        SpringApplication.run(ApplicationMain2.class, args);
    }
}
