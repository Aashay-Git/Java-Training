package com.fooddelivery.fooddelivery.controller;

import com.fooddelivery.fooddelivery.model.Order;
import com.fooddelivery.fooddelivery.model.Restaurant;
import com.fooddelivery.fooddelivery.model.User;
import com.fooddelivery.fooddelivery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    public void createNewOrder() {
        // 1. Create Data (Models) - Using 'new'
        User user = new User();
        user.setUserId(1);
        user.setUserName("John Doe");
        user.setAddress("123 Java Lane");

        Restaurant rest = new Restaurant();
        rest.setResId(101);
        rest.setRestName("Pizza Hut");

        Order order = new Order();
        order.setOrderId(500);
        order.setItems(new String[]{"Cheese Pizza", "Garlic Bread"});
        order.setDate(new Date());

        // 2. Pass these to the Spring Service
        orderService.processOrder(order, user, rest);

        System.out.println("Order process completed!");
    }
}
