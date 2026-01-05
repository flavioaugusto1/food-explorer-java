package com.food_explorer.mapper;

import com.food_explorer.controller.request.MealRequest;
import com.food_explorer.controller.response.MealResponse;
import com.food_explorer.entity.Meal;
import lombok.experimental.UtilityClass;

@UtilityClass
public class MealMapper {
    private static Meal toMeal(MealRequest mealRequest) {
        return Meal.builder()
                .name(mealRequest.name())
                .description(mealRequest.description())
                .image(mealRequest.image())
                .category(mealRequest.category())
                .build();
    }

    private static MealResponse toMealResponse(Meal meal) {
        return MealResponse.builder()
                .name(meal.getName())
                .description(meal.getDescription())
                .image(meal.getImage())
                .category(meal.getCategory())
                .build();
    }
}
