package com.example1.foodiesapi.service;


import com.example1.foodiesapi.dto.CartRequest;
import com.example1.foodiesapi.dto.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}