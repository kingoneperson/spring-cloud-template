package com.storm.spring.cloud.service.account.controller;

import com.storm.spring.cloud.service.account.pojo.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/phone/{phoneNum}")
    public User getUserByPhoneNum(@PathVariable("phoneNum") String phoneNum){
        User user = new User();
        if(StringUtils.isNotBlank(phoneNum)){
            user.setId(1L);
            user.setName("梁奇锋");
            user.setAge(30);
            user.setPhoneNum("13929959172");
        }
        return user;
    }
}
