package com.ravindra.controller;

import com.ravindra.data.Product;
import com.ravindra.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productServis;

    @PostMapping("/product")
    public void createProduct(@RequestBody Product product){
        productServis.createProduct(product);
    }
    @GetMapping("/product")
    public Iterable<Product> getProducts(){
        return productServis.getProducts();
    }
}
