package com.sanket.tabnine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryManagerTest {

    private InventoryManager inventoryManager;

    @BeforeEach
    void setUp() {
        inventoryManager = new InventoryManager();
    }

    @Test
    void testGetProduct() {
        // Create some sample products
        Product product1 = new Product(1001, "Product 1", 10);
        Product product2 = new Product(1002, "Product 2", 20);

        // Add products to the inventory
        inventoryManager.addProduct(1001, product1);
        inventoryManager.addProduct(1002, product2);

        // Get a product by its id
        Product retrievedProduct = inventoryManager.getProduct(1002);

        // Check that the retrieved product is the same as the one we added
        assertEquals(product2, retrievedProduct);
    }

    @Test
    void testRemoveProduct() {
        // Create some sample products
        Product product1 = new Product(1001, "Product 1", 10);
        Product product2 = new Product(1002, "Product 2", 20);

        // Add products to the inventory
        inventoryManager.addProduct(1001, product1);
        inventoryManager.addProduct(1002, product2);

        // Remove a product from the inventory
        inventoryManager.removeProduct(1001);

        // Check that the removed product is no longer in the inventory
        assertNull(inventoryManager.getProduct(1001));
    }

    @Test
    void testGetAllProducts() {
        // Create some sample products
        Product product1 = new Product(1001, "Product 1", 10);
        Product product2 = new Product(1002, "Product 2", 20);
        Product product3 = new Product(1003, "Product 3", 30);

        // Add products to the inventory
        inventoryManager.addProduct(1001, product1);
        inventoryManager.addProduct(1002, product2);
        inventoryManager.addProduct(1003, product3);

        // Get all products from the inventory
        List<Product> allProducts = inventoryManager.getAllProducts();

        // Check that the list contains all the products we added
        assertEquals(3, allProducts.size());
        assertTrue(allProducts.contains(product1));
        assertTrue(allProducts.contains(product2));
        assertTrue(allProducts.contains(product3));
    }
}