package com.storm.spring.cloud.service.order.feign;

import com.storm.spring.cloud.service.order.hystrix.AccountServiceHystrix;
import com.storm.spring.cloud.service.order.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "spring-cloud-service-account",fallback = AccountServiceHystrix.class)
public interface AccountService {

    @GetMapping("/user/phone/{phoneNum}")
    public User getUser(@PathVariable("phoneNum") String phoneNum);
}
