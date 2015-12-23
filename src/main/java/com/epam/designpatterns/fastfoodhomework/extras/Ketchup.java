package com.epam.designpatterns.fastfoodhomework.extras;

import com.epam.designpatterns.fastfoodhomework.products.Product;

public class Ketchup implements Product {
    
    private Product product;

    public Ketchup(Product product) {
        super();
        this.product = product;
    }

    @Override
    public int getHappiness() {
        return product.getHappiness() * 2;
    }
}
