package com.oneself.example.circular1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: application.properties文件中设置spring.main.allow-circular-references=true解决循环依赖问题
 * <p>官方说明：https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.6-Release-Notes</p>
 *
 *
 * @Author: Ron
 * @Create: 2024-05-22 上午11:36
 */
@Service
public class UserService {

    @Autowired
    private OrderService orderService;

    public UserService() {
        System.out.println("UserService is being initialized.");
    }
}
