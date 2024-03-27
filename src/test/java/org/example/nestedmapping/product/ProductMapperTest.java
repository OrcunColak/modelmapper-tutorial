package org.example.nestedmapping.product;

import org.example.nestedmapping.product.dto.ProductDto;
import org.example.nestedmapping.product.model.Product;
import org.example.nestedmapping.product.model.ProductDetails;
import org.example.nestedmapping.product.model.Rating;
import org.example.nestedmapping.product.model.Review;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class ProductMapperTest {

    private final ProductMapper productMapper = new ProductMapper();

    private Product createProduct() {
        ProductDetails productDetails = new ProductDetails(1,
                "technicalSpecifications",
                "specialFeatures",
                "extendedDescription"
                );

        List<Rating> ratings = null;
        List<Review> reviews = null;
        return new Product(
                1,
                "productName",
                "description",
                "category",
                "brand",
                "manufacturer",
                "color",
                "size",
                10.0,
                5,
                true,
                productDetails,
                ratings,
                reviews
        );
    }

    @Test
    void testToDto() {
        Product product = createProduct();
        ProductDto result = productMapper.toDto(product);
        Assertions.assertEquals(product.getProductDetails().getExtendedDescription(), result.getProductDetails().getExtendedDescription());
    }

    // @Test
    // void testToDtoList() {
    //     List<ProductDto> result = productMapper.toDtoList(List.of(new Product()));
    //     Assertions.assertEquals(List.of(new ProductDto()), result);
    // }
    //
    // @Test
    // void testFromDto() {
    //     Product result = productMapper.fromDto(new ProductDto());
    //     Assertions.assertEquals(new Product(), result);
    // }
}
