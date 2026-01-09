package com.fooddelivery.fooddelivery.service;

import com.fooddelivery.fooddelivery.model.Order;
import com.fooddelivery.fooddelivery.model.Restaurant;
import com.fooddelivery.fooddelivery.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DeliveryService {
    public void startDelivery(Order order, Restaurant from, User to) {
        System.out.println("Delivery started from " + from.getRestName() + " to " + to.getAddress());
        System.out.println("Status: Out for Delivery");
    }
}


