package org.example.DecoratorPattern;

public class EmployeeDecorator implements EmployeeInteface{
    protected EmployeeInteface employeeDecorator;

    public EmployeeDecorator(EmployeeInteface employeeDecorator) {
        this.employeeDecorator = employeeDecorator;
    }
    @Override
    public void work() {
        employeeDecorator.work();
    }
}
