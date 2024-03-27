package org.example.nestedmapping.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private String description;
    private String category;
    private String brand;
    private String manufacturer;
    private String color;
    private String size;
    private double price;
    private int stockQuantity;
    private boolean isActive;
    private ProductDetails productDetails;
    private List<Rating> ratings;
    private List<Review> reviews;
}
