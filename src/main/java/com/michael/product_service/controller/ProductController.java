package com.michael.product_service.controller;

import com.michael.product_service.dto.ProductRequest;
import com.michael.product_service.dto.ProductResponse;
import com.michael.product_service.model.Product;
import com.michael.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) {
        return new ResponseEntity<>(productService.createProduct(productRequest), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK) ;
    }
}
