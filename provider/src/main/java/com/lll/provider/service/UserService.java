package com.lll.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lll.api.user.UserApi;
@Service
public class UserService implements UserApi {
    @Override
    public String say() {
        return "hello,springboot-dubbo";
    }
}
