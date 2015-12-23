package com.epam.designpatterns.fastfoodhomework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epam.designpatterns.fastfoodhomework.products.Product;
import com.epam.designpatterns.fastfoodhomework.products.ProductFactory;
import com.epam.designpatterns.fastfoodhomework.products.Products;

public class FastFoodRestaurant {
    
    private static final Logger logger = LoggerFactory.getLogger(FastFoodRestaurant.class.getName());
    
    public static void main(String[] args) {
        logger.debug("App started");
        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.getProduct(Products.CHIPS);
    }
}
