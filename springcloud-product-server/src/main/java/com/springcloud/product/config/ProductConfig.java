package com.springcloud.product.config;

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
@ConfigurationProperties(prefix = "product")
@RefreshScope
public class ProductConfig {

    private Proudct config;

    public static class Proudct{
        private String name;

        private Integer amount;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }
    }


}
