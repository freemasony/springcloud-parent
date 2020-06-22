package com.springcloud.user.service;

import com.springcloud.user.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author zhoujian
 * @date 2020/6/22
 */
@Component
@RefreshScope
public class UserService {

    @Autowired
    private UserConfig userConfig;

    public String getUser() {
        return userConfig.getConfig().getName();
    }
}
