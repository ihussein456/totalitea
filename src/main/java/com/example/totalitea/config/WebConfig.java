package com.example.totalitea.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Apply CORS to all paths
                .allowedOrigins("http://localhost:3000")  // Allow this origin to access the APIs
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Allowed HTTP Methods
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true);  // Allow credentials
    }
}