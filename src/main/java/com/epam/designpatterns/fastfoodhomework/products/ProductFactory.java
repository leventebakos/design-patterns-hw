package com.epam.designpatterns.fastfoodhomework.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductFactory {

    private static final Logger logger = LoggerFactory.getLogger(ProductFactory.class.getName());

    public Product getProduct(Products product, int happiness) {
        Product ret = null;
        if (product == Products.HOTDOG) {
            ret = new HotDog(happiness);
        } else if (product == Products.CHIPS) {
            ret = new Chips(happiness);
        }
        logger.debug("Created new " + ret.getClass().getName() + " instance.");
        return ret;
    }

}
