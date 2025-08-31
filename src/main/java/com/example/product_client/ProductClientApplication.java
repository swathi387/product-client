package com.example.product_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
public class ProductClientApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
        new ProductClientApplication()
        .configure(new SpringApplicationBuilder(ProductClientApplication.class))
        .run(args);
	}
   
}
