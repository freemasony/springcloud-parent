package com.springcloud.user.controller;

import com.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujian
 * @date 2020/6/22
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "query/user/{id}")
    public String getUser(@PathVariable("id") Long id){
        return userService.getUser();
    }
}
