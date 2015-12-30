package com.epam.designpatterns.fastfoodhomework.products;

public class Chips implements Product {
    private int happiness;

    public Chips(int happiness) {
        super();
        this.happiness = happiness;
    }

    @Override
    public int getHappiness() {
        return (int) (happiness * 1.05);
    }

}
