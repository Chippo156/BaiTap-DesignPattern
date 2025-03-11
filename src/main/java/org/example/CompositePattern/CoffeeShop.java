package org.example.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements BillComponent {
    private List<Table> tables = new ArrayList<>();


    public void addTable(Table table) {
        tables.add(table);
    }
    @Override
    public double getPrice() {
        double total = 0;
        for (Table table : tables) {
            total += table.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Coffee Shop + " + getPrice() + " VND";
    }
}
