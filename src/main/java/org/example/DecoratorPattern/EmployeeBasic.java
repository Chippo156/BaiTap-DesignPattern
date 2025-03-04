package org.example.DecoratorPattern;

public class EmployeeBasic implements EmployeeInteface{
    private String name;

    public EmployeeBasic(String name) {
        this.name = name;
    }
    @Override
    public void work() {
        System.out.println(name + ": Làm việc cơ bản.");
    }
}
