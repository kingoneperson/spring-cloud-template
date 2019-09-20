package com.storm.spring.cloud.service.order.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Long id;
    private String name;
    private String phoneNum;
    private Integer age;
}
