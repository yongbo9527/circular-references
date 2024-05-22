package com.oneself.example.circular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
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
