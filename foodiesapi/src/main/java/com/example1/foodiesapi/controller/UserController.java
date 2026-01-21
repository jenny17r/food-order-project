package com.example1.foodiesapi.controller;
import com.example1.foodiesapi.dto.UserRequest;
import com.example1.foodiesapi.dto.UserResponse;
import com.example1.foodiesapi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;


    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse register(@RequestBody UserRequest request) {
        return userService.registerUser(request);
    }
}
//@RequestBody:
//
//Reads JSON from frontend
//
//Converts it into UserRequest object