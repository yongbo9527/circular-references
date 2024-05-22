package com.oneself.example.noncyclic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Ron
 * @Create: 2024-05-22 上午11:36
 */
@Service
public class OrderService {

    @Autowired
    private UserService userService;

    public OrderService() {
        System.out.println("OrderService is being initialized.");
    }
}
