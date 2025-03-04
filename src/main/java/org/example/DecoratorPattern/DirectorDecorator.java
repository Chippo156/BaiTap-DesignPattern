package org.example.DecoratorPattern;

public class DirectorDecorator extends EmployeeDecorator{
    public DirectorDecorator(EmployeeInteface decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(" - Giám đốc: Quản lý công ty.");    }

}
