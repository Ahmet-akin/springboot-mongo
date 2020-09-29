package com.ravindra.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProductData")
public class Product {
    @Id
    private String id;
    private String productId;
    private String productName;
    private double productPrise;
    private Vendor vendor;
    public Product() {
    }
    public Product(String id, String productId, String productName, double productPrise, Vendor vendor) {
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.productPrise = productPrise;
        this.vendor = vendor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrise() {
        return productPrise;
    }

    public void setProductPrise(double productPrise) {
        this.productPrise = productPrise;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
