package com.storm.spring.cloud.service.order.hystrix;

import com.storm.spring.cloud.service.order.feign.AccountService;
import com.storm.spring.cloud.service.order.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceHystrix implements AccountService {
    @Override
    public User getUser(String phoneNum) {
        return new User();
    }
}
