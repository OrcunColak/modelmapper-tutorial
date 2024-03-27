package org.example.nestedmapping.product.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProductDto {
    private String productName;
    private String brand;

    private String manufacturer;
    private ProductDetailsDto productDetails;
    private List<ReviewDto> reviews;
    private List<RatingDto> ratings;
}
