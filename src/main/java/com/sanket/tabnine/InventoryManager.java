package com.sanket.tabnine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Inventory Manager class that adds, removes, lists and updates Product
 */
public class InventoryManager {

    private Map<Integer, Product> products;

    /**
     * Constructor for InventoryManager
     */
    public InventoryManager() {
        products = new HashMap<>();
    }

    /**
     * Main method for testing the InventoryManager class
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        InventoryManager inventoryManager = getInventoryManager();

        // Get a product by its id
        Product retrievedProduct = inventoryManager.getProduct(1002);
        System.out.println("Retrieved product: " + retrievedProduct);

        // Remove a product from the inventory
        inventoryManager.removeProduct(1001);

        // Get all products from the inventory
        List<Product> allProducts = inventoryManager.getAllProducts();
        System.out.println("All products: " + allProducts);
    }

    /**
     * Get an instance of InventoryManager with some sample products
     *
     * @return InventoryManager instance
     */
    private static InventoryManager getInventoryManager() {
        InventoryManager inventoryManager = new InventoryManager();

        // Create some sample products
        Product product1 = new Product(1001, "Product 1", 10);  // Changed 10.00 to 10
        Product product2 = new Product(1002, "Product 2", 20);  // Changed 20.00 to 20
        Product product3 = new Product(1003, "Product 3", 30);  // Changed 30.00 to 30

        // Add products to the inventory
        inventoryManager.addProduct(1001, product1);
        inventoryManager.addProduct(1002, product2);
        inventoryManager.addProduct(1003, product3);
        return inventoryManager;
    }

    /**
     * Add a product to the inventory
     *
     * @param productId unique identifier for the product
     * @param product   the product to be added
     */
    public void addProduct(int productId, Product product) {
        products.put(productId, product);
    }

    /**
     * Remove a product from the inventory
     *
     * @param productId unique identifier for the product to be removed
     */
    public void removeProduct(int productId) {
        products.remove(productId);
    }

    /**
     * Get a product by its id
     *
     * @param productId unique identifier for the product
     * @return the product with the given id, or null if not found
     */
    public Product getProduct(int productId) {
        return products.get(productId);
    }

    /**
     * Set the products in the inventory
     *
     * @param products the products to be set in the inventory
     */
    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    /**
     * Get all products from the inventory
     *
     * @return a list of all products in the inventory
     */
    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }
}