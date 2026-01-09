package com.fooddelivery.fooddelivery.service;

import com.fooddelivery.fooddelivery.model.Order;
import com.fooddelivery.fooddelivery.model.Restaurant;
import com.fooddelivery.fooddelivery.model.User;
import com.fooddelivery.fooddelivery.repository.OrderRepository;
import com.fooddelivery.fooddelivery.service.DeliveryService;
import com.fooddelivery.fooddelivery.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired private RestaurantService restaurantService;
    @Autowired private DeliveryService deliveryService;

    public void processOrder(Order order, User user, Restaurant restaurant) {
        System.out.println("Processing order for: " + user.getUserName());

        // 1. Save the order
        orderRepository.saveOrder(order);

        // 2. Tell the restaurant to cook based on order items
        restaurantService.prepareFood(restaurant, order.getItems());

        // 3. Create a delivery and send it
        deliveryService.startDelivery(order, restaurant, user);
    }
}