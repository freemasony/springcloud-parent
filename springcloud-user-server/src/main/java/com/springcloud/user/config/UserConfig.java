package com.springcloud.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author zhoujian
 * @date 2020/6/19
 */
@Component
@Data
@ConfigurationProperties(prefix = "user")
@RefreshScope
public class UserConfig {

    private user config;

    public static class user{
        private String name;

        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }


}
