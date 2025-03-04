package org.example.DecoratorPattern;

public class TeamLeaderDecorator extends EmployeeDecorator{
    public TeamLeaderDecorator(EmployeeInteface decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(" - Đội trưởng: Đi tuần và gán việc nhân viên.");
    }
}
