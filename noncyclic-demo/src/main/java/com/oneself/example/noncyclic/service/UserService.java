package com.oneself.example.noncyclic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Ron
 * @Create: 2024-05-22 上午11:47
 */
@Service
public class UserService {

    @Autowired
    private OrderService orderService;

    public UserService() {
        System.out.println("UserService is being initialized.");
    }
}


