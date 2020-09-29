package com.ravindra.service;

import com.ravindra.data.Product;
import com.ravindra.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public void createProduct(Product product) {
        productRepo.save(product);
    }

    public Iterable<Product> getProducts() {
       return productRepo.findAll();
    }
}
