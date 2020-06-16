package com.springcloud.api.controller;

import com.springcloud.api.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 * @date 2020/6/15
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping(value = "/get/product")
    public String getProduct(){
        return apiService.getProduct();
    }
}
