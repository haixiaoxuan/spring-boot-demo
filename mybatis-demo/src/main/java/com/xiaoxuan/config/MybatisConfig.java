package com.xiaoxuan.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description
 *
 *  此处的配置也可以通过application.yml 配置文件来配置
 *
 * Created by xiexiaoxuan on 2020/11/28.
 */
@Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer customizer(){
        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {
                // 将数组库字段的下划线与驼峰命名映射
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
