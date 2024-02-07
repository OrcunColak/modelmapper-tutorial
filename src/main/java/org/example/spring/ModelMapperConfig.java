package org.example.spring;

import org.modelmapper.ModelMapper;

/**
 * See <a href="https://medium.com/@fgesora/using-modelmapper-in-springboot-1ffc765f1eaf">...</a>
 */
// @Configuration
public class ModelMapperConfig {

    // @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        // You can configure any custom mappings here as needed
        return modelMapper;
    }
}
