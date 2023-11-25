package com.dan920dev.carsapi.controllers;


import com.dan920dev.carsapi.models.dtos.CategoryDTO;
import com.dan920dev.carsapi.models.entities.Categories;
import com.dan920dev.carsapi.models.entities.Products;
import com.dan920dev.carsapi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/MARKET/cars/")
public class categoriesController {

    @Autowired
    CategoryService categorySv;


    @GetMapping("category/all")
    public ResponseEntity<?> getAllCategories(){

        try{
            List<CategoryDTO> response = new ArrayList<>();


            return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
        }catch (Exception e){

            e.printStackTrace();
            return new ResponseEntity<>("Error processing categories data", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
