package com.epam.designpatterns.fastfoodhomework;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.epam.designpatterns.fastfoodhomework.extras.Ketchup;
import com.epam.designpatterns.fastfoodhomework.extras.Mustard;
import com.epam.designpatterns.fastfoodhomework.products.Product;
import com.epam.designpatterns.fastfoodhomework.products.ProductFactory;
import com.epam.designpatterns.fastfoodhomework.products.Products;

public class FastFoodRestaurantTest {

    private ProductFactory productFactory;

    @Before
    public void setUp() {
        productFactory = new ProductFactory();
    }

    @Test
    public void happinessShouldBe10WhenClientWithHappinessOf5OrderedChipsWithKetchup() {
        // Given
        // see setUp

        // When
        Client client = new Client("Pista", 5);
        Product product = new Ketchup(productFactory.getProduct(Products.CHIPS, 5));
        client.order(product);
        client.setHappiness(product.getHappiness());

        // Then
        assertEquals(10, client.getHappiness(), 0.000001);
    }

    @Test
    public void happinessShouldBe211WhenClientWithHappinessOf100OrderedChipsWithMustardAndKetchup() {
        // Given
        // see setUp

        // When
        Client client = new Client("Pista", 100);
        Product product = new Mustard(new Ketchup(productFactory.getProduct(Products.CHIPS, 100)));
        client.order(product);
        client.setHappiness(product.getHappiness());

        // Then
        assertEquals(211, client.getHappiness(), 0.000001);
    }

    @Test
    public void happinessShouldBe212WhenClientWithHappinessOf100OrderedChipsWithKetchupAndMustard() {
        // Given
        // see setUp

        // When
        Client client = new Client("Pista", 100);
        Product product = new Ketchup(new Mustard(productFactory.getProduct(Products.CHIPS, 100)));
        client.order(product);
        client.setHappiness(product.getHappiness());

        // Then
        assertEquals(212, client.getHappiness(), 0.000001);
    }

}
