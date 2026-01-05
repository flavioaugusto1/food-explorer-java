package com.food_explorer.controller.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record UserResponse(long id, String name, String email, LocalDateTime createdAt, LocalDateTime updatedAt) {
}
