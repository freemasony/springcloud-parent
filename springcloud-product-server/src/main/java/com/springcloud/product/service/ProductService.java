package com.springcloud.product.service;

import org.springframework.stereotype.Component;

/**
 * @author zhoujian
 * @date 2020/6/15
 */
@Component
public class ProductService {

    public String getProduct(){
        return "我是产品A";
    }
}
