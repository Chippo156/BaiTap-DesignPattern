package org.example;

import org.example.CompositePattern.CoffeeShop;
import org.example.CompositePattern.Product;
import org.example.CompositePattern.Table;
import org.example.ObserverPattern.Classroom;
import org.example.ObserverPattern.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Observer Pattern
        //Create a Classroom object
        Classroom classroom = new Classroom();
        classroom.attach(new Student("Hiep"));
        //Notify all students
        classroom.notification();

        //Output:Composite pattern
        System.out.println("-----------------------------------------------");

// Tạo sản phẩm
        Product coffee = new Product("Cà phê", 25000);
        Product tea = new Product("Trà sữa", 35000);
        Product water = new Product("Nước suối", 10000);
        Product juice = new Product("Nước ép cam", 40000);

        // Tạo bàn 1
        Table table1 = new Table();
        table1.addProduct(coffee);
        table1.addProduct(tea);

        // Tạo bàn 2
        Table table2 = new Table();
        table2.addProduct(water);
        table2.addProduct(juice);

        // Tạo quán cà phê
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.addTable(table1);
        coffeeShop.addTable(table2);

        // In tổng tiền từng bàn
        System.out.println("Doanh thu bàn 1: " + table1.getPrice() + " VND");
        System.out.println("Doanh thu bàn 2: " + table2.getPrice() + " VND");

        // In tổng doanh thu quán cà phê
        System.out.println("Tổng doanh thu quán: " + coffeeShop.getPrice() + " VND");


    }
}