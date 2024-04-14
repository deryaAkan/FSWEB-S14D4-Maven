package org.example.model;

public class Bread extends ProductForSale{

    private String flour;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public Bread(String type, double price, String description, String flour) {
        super(type, price, description);
        this.flour = flour;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "flour='" + flour + '\'' +
                '}';
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }
}
