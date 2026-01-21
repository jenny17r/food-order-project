package com.example1.foodiesapi.service;


import com.example1.foodiesapi.dto.UserRequest;
import com.example1.foodiesapi.dto.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
