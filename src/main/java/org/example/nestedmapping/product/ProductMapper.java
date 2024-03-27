package org.example.nestedmapping.product;

import org.example.nestedmapping.product.dto.ProductDto;
import org.example.nestedmapping.product.model.Product;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public ProductDto toDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }

    public List<ProductDto> toDtoList(List<Product> products) {
        return products.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


    public Product fromDto(ProductDto productDto) {
        return modelMapper.map(productDto, Product.class);
    }
}
