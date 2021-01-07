package com.huazheng.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @projectName:springboot-demo
 * @see:com.huazheng.config
 * @author:zhanghuazheng
 * @createTime:2021/1/7 21:06
 * @version:1.0
 */

@Component
@PropertySource("classpath:my.properties")
@ConfigurationProperties(prefix = "zhz")
@Data
public class ZhzConfig {

    private String name;
    private Integer age;
    private String job;

    @Override
    public String toString() {
        return "ZhzConfig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
