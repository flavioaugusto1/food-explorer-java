package com.food_explorer.controller.request;

import com.food_explorer.entity.Category;

public record MealRequest(String name, String description, String image, double price, Category category) {
}
