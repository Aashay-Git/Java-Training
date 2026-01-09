package com.fooddelivery.fooddelivery.service;

import com.fooddelivery.fooddelivery.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RestaurantService {
    public void prepareFood(Restaurant res, String[] items) {
        System.out.println(res.getRestName() + " is preparing: " + Arrays.toString(items));
    }
}
