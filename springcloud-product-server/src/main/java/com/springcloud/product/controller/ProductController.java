package com.springcloud.product.controller;

import com.springcloud.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 * @date 2020/6/15
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping(value = "query/product/{id}")
    public String getProduct(@PathVariable("id") Long id){
        return productService.getProduct();
    }
}
