package com.springcloud.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhoujian
 * @date 2020/6/15
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudProductApplication   {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringCloudProductApplication.class, args);
    }


}
