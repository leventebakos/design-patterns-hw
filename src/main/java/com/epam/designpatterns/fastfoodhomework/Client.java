package com.epam.designpatterns.fastfoodhomework;

import com.epam.designpatterns.fastfoodhomework.products.Product;

public class Client {

    private String name;
    private int happiness;

    public Client(String name, int happiness) {
        super();
        this.name = name;
        this.happiness = happiness;
    }

    public String getName() {
        return name;
    }

    public double getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void order(Product product) {
        this.happiness = product.getHappiness();
    }

}
