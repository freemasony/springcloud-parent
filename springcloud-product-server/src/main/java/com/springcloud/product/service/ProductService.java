package com.springcloud.product.service;

import com.springcloud.product.config.ProductConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author zhoujian
 * @date 2020/6/15
 */
@Component
@RefreshScope
public class ProductService {

    @Autowired
    private ProductConfig productConfig;

    public String getProduct(){
        return productConfig.getConfig().getName();
    }
}
