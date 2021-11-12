package com.example.ExamenSpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelConfiguration {
    @Bean
    public ModelConfiguration modelMapper() {
        return new ModelConfiguration();
    }
}
