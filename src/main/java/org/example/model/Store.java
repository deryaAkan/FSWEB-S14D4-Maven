package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Milk Chocolate", 2.5, "chocolaate" );
        products[1] = new Coke("Diet Coke", 1.0, "coooke");
        products[2] = new Bread("Whole Grain Bread", 1.5, "breaaad");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products) {
            if (product != null) {
                product.showDetails();
            }
        }
    }
}