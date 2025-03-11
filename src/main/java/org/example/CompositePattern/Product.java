package org.example.CompositePattern;

public class Product implements BillComponent {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " VND";

    }
}
