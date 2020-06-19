package com.springcloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zhoujian
 * @date 2020/6/19
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudUserApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringCloudUserApplication.class, args);
    }
}
