package com.springcloud.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhoujian
 * @date 2020/6/15
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudRegistryApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringCloudRegistryApplication.class, args);
    }
}
