package com.epam.designpatterns.fastfoodhomework.products;

public class HotDog implements Product {

    private int happiness;

    public HotDog(int happiness) {
        super();
        this.happiness = happiness;
    }

    @Override
    public int getHappiness() {
        return happiness + 2;
    }
}
