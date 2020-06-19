package com.springcloud.product.service;

import com.springcloud.product.config.ProudctConfig;
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
    private ProudctConfig proudctConfig;

    public String getProduct(){
        return proudctConfig.getConfig().getName();
    }
}
