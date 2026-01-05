package com.food_explorer.controller.response;

import com.food_explorer.entity.Category;
import lombok.Builder;

@Builder
public record MealResponse(String name, String description, String image, double price, Category category) {
}
