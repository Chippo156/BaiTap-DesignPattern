package org.example.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Table implements BillComponent{
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    @Override
    public double getPrice() {
       double total = 0;
       for (Product product : products){
           total += product.getPrice();
       }
       return total;
    }

}
