package com.springcloud.api.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhoujian
 * @date 2020/6/15
 */
@Component
@Slf4j
public class ApiService {

    @Resource
    private RestTemplate restTemplate;

    public String getProduct(){
        String result=restTemplate.getForObject("http://springcloud-product-server/query/product/{id}",String.class,1);
        log.info("商品系统调用商品服务,result:" + result);
        return result;
    }
}
