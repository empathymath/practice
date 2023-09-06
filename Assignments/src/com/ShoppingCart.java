package com;

class ShoppingCart {
    // Method to add a general product
    public void addProduct(String productName, int quantity) {
        System.out.println(quantity + " " + productName + "(s) added to the cart.");
    }

    // Overloaded method to add a product with a price
    public void addProduct(String productName, int quantity, double pricePerItem) {
        double totalCost = quantity * pricePerItem;
        System.out.println(quantity + " " + productName + "(s) added to the cart at $" + pricePerItem + " each. Total cost: $" + totalCost);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart using overloaded methods
        cart.addProduct("Apple", 5);
        cart.addProduct("Laptop", 1, 1200.0);
        cart.addProduct("Book", 3, 10.0);
    }
}
