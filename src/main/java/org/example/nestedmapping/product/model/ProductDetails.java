package org.example.nestedmapping.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductDetails {
    private int productDetailsId;
    private String technicalSpecifications;
    private String specialFeatures;
    private String extendedDescription;
}
