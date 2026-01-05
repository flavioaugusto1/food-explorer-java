package com.food_explorer.mapper;

import com.food_explorer.controller.response.CategoryResponse;
import com.food_explorer.entity.Category;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CategoryMapper {
    private static Category toCategory(CategoryResponse categoryResponse) {
        return Category.builder()
                .name(categoryResponse.name())
                .build();
    }

    public static CategoryResponse toCategoryResponse(Category category) {
        return CategoryResponse.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }
}
