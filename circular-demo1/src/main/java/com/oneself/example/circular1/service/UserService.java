package com.oneself.example.circular1.service;

import org.springframework.stereotype.Service;

/**
 * @Description: 使用setter 注入解决循环依赖
 *
 * <p>当依赖通过setter方法（延迟注入）注入而不是构造器注入时，
 * Spring可以在创建Bean的早期阶段先实例化Bean，即使该Bean的部分依赖尚未完全注入。
 * 具体到循环依赖场景中，这意味着Spring可以先创建UserService和OrderService的实例，
 * 但将它们中依赖对方的部分（即setter注入的部分）留待稍后完成。</p>
 *
 * @Author: Ron
 * @Create: 2024-05-22 上午11:36
 */
@Service
public class UserService {

    private OrderService orderService;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderService getOrderService() {
        return orderService;
    }
}
