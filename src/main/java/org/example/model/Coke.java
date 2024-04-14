package org.example.model;

public class Coke extends ProductForSale{

    private int volume;
    @Override
    void showDetails() {
        System.out.println(super.toString() + this);
    }


    @Override
    public String toString() {
        return "Coke{" +
                "volume=" + volume +
                '}';
    }

    public Coke(String type, double price, String description) {
        super(type, price, description);

    }
}
