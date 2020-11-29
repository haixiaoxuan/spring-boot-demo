package com.xiaoxuan.controller;

import com.xiaoxuan.model.NoConfigurationBean;
import com.xiaoxuan.model.YamlModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/26.
 */

@RestController
public class HelloController {

    @Autowired
    private YamlModel yamlModel;


    @RequestMapping("hello")
    public String hello(){
        System.out.println(noConfigurationBean);
        return "hello spring boot xxxx";
    }


    @RequestMapping("yaml")
    public String yaml(){

        System.out.println(yamlModel.toString());
        return yamlModel.toString();
    }

    @Autowired
    private NoConfigurationBean noConfigurationBean;

    @Bean
    private NoConfigurationBean getNoConfigurationBean(){
        return new NoConfigurationBean();
    }

}
