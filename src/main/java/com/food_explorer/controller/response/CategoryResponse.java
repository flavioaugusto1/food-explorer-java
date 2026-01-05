package com.food_explorer.controller.response;

import lombok.Builder;

@Builder
public record CategoryResponse(Long id, String name) {
}
