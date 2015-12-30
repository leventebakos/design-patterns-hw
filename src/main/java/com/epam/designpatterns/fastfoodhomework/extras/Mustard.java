package com.epam.designpatterns.fastfoodhomework.extras;

import com.epam.designpatterns.fastfoodhomework.products.Product;

public class Mustard implements Product {

    private Product product;

    public Mustard(Product product) {
        super();
        this.product = product;
    }

    @Override
    public int getHappiness() {
        return product.getHappiness() + 1;
    }

}
