package com.storm.spring.cloud.service.order.controller;

import com.storm.spring.cloud.service.order.feign.AccountService;
import com.storm.spring.cloud.service.order.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private AccountService accountService;

    @Value("${order.num}")
    private String orderNum;

    @GetMapping("/user")
    public User getUser(String phoneNum){
        User user = accountService.getUser(phoneNum);
        return user;
    }

    @GetMapping("/num/get")
    public String getOrderNum(){
        return orderNum;
    }
}
