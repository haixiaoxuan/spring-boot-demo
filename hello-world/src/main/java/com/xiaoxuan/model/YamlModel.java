package com.xiaoxuan.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * description
 * <p>
 * Created by xiexiaoxuan on 2020/11/28.
 */

@Component
@ConfigurationProperties(prefix = "yamltest")

public class YamlModel {

    private String str;

    private int num;

    private float floatnum;

    private Date birth;

    @Override
    public String toString() {
        return "YamlModel{" +
                "str='" + str + '\'' +
                ", num=" + num +
                ", floatnum=" + floatnum +
                ", birth=" + birth +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getFloatnum() {
        return floatnum;
    }

    public void setFloatnum(float floatnum) {
        this.floatnum = floatnum;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
