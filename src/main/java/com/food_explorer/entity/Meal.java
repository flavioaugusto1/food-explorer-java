package com.food_explorer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "meals")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "meal", nullable = false)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "image")
    private String image;

    @Column(name = "price", nullable = false)
    private Double price;

    @JoinColumn(name = "category_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

}
