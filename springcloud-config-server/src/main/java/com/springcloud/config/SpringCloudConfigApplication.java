package com.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author zhoujian
 * @date 2020/6/19
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class SpringCloudConfigApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringCloudConfigApplication.class, args);
    }
}
