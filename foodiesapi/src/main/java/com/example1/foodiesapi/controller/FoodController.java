package com.example1.foodiesapi.controller;

import com.example1.foodiesapi.dto.FoodRequest;
import com.example1.foodiesapi.dto.FoodResponse;
import com.example1.foodiesapi.service.FoodService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
@AllArgsConstructor
@CrossOrigin("*")
public class FoodController {

    private final FoodService foodService;
//Frontend sends:
//
//food → JSON string
//
//file → image
    @PostMapping
    public FoodResponse addFood(@RequestPart("food") String foodString,
                                @RequestPart("file")MultipartFile file) {
//Spring:Cannot auto-convert JSON string → object
//objectmapper from Jackson library: Converts JSON ↔ Java objects
        ObjectMapper objectMapper = new ObjectMapper();
        FoodRequest request = null;
        try {
            //JSON string → FoodRequest object
            request = objectMapper.readValue(foodString, FoodRequest.class);
        }catch(JsonProcessingException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid JSON format");
        }
        FoodResponse response = foodService.addFood(request, file);
        return response;
    }

    @GetMapping
    public List<FoodResponse> readFoods() {
        return foodService.readFoods();
    }

    @GetMapping("/{id}")
    public FoodResponse readFood(@PathVariable String id) {
        return foodService.readFood(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFood(@PathVariable String id) {
        foodService.deleteFood(id);
    }
}
/*
ADD FOOD (Admin only – JWT required)
Admin React
 ↓
POST /api/foods
(form-data: food JSON + image file)
 ↓
JWT Filter
 (checks admin login)
 ↓
FoodController
 ↓
ObjectMapper (JSON → FoodRequest)
 ↓
FoodService.addFood()
 ↓
Upload image to AWS S3
 ↓
Save food to MongoDB
 ↓
FoodResponse
 ↓
React Admin UI



READ FOODS (Public – NO JWT)
User React
 ↓
GET /api/foods
 ↓
FoodController
 ↓
FoodService.readFoods()
 ↓
FoodRepository.findAll()
 ↓
MongoDB (foods)
 ↓
FoodResponse List
 ↓
React UI (food cards)
 */
