package org.example.nestedmapping.product.dto;

import lombok.Data;

@Data
public class ProductDetailsDto {
    private int productDetailsId;
    private String technicalSpecifications;
    private String specialFeatures;
    private String extendedDescription;
}
