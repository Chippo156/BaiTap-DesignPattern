package org.example.DecoratorPattern;

public class OfficeStaffDecorator extends EmployeeDecorator {
    public OfficeStaffDecorator(EmployeeInteface decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(" - Nhân viên văn phòng: Làm việc văn phòng.");
    }

}
