package com.fooddelivery.fooddelivery.repository;

import com.fooddelivery.fooddelivery.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    // In a real app, this would be a Database. Here, we use a List.
    private List<Order> database = new ArrayList<>();

    public void saveOrder(Order order) {
        database.add(order);
        System.out.println("Order #" + order.getOrderId() + " saved to database.");
    }
}