package org.example.model;

public class Chocolate extends ProductForSale {
    private String chocolateType;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "chocolateType='" + chocolateType + '\'' +
                '}';
    }

    @Override
    void showDetails() {
        System.out.println(super.toString() + this);
    }
}
