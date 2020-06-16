package com.springcloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoujian
 * @date 2020/6/15
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudApiApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringCloudApiApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
