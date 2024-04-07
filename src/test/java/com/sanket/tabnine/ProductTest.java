package com.sanket.tabnine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    void testProductConstructor() {
        Product product = new Product(1, "Test Product", 10);
        assertEquals(1, product.getId());
        assertEquals("Test Product", product.getName());
        assertEquals(10, product.getQuantity());
    }

    @Test
    void testProductSettersAndGetters() {
        Product product = new Product(1, "Test Product", 10);
        product.setId(2);
        product.setName("New Product");
        product.setQuantity(20);
        assertEquals(2, product.getId());
        assertEquals("New Product", product.getName());
        assertEquals(20, product.getQuantity());
    }

    @Test
    void testProductToString() {
        Product product = new Product(1, "Test Product", 10);
        assertEquals("Product{id=1, name='Test Product', quantity=10}", product.toString());
    }
}