package org.example.model;

public class Bread extends ProductForSale{

    private String flour;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "flour='" + flour + '\'' +
                '}';
    }

    @Override
    void showDetails() {
        System.out.println(super.toString() + this);
    }
}
