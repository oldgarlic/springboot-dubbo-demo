package com.lll.comsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lll.api.user.UserApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {
    @Reference
    private UserApi userApi;

    @GetMapping
    public String hello(){
        return userApi.say();
    }
}
