package org.example.nestedmapping.product.model;

import lombok.Data;

@Data
public class Review {
    private long id;
    private String reviewComment;
    private Product product;
}
