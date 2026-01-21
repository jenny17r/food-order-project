package com.example1.foodiesapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Builder
@NoArgsConstructor          // 🔴 REQUIRED
@AllArgsConstructor
public class OrderItem {

    private String foodId;
    private int quantity;
    private Double price;
    private String category;
    private String imageUrl;
    private String description;
    private String name;
}
