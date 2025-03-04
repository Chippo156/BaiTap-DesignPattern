package org.example;

import org.example.DecoratorPattern.*;
import org.example.NoPattern.Employee;
import org.example.StatePattern.EmployeeStatePattern;
import org.example.StatePattern.PositionState;
import org.example.StatePattern.TeamLeader;
import org.example.StrategyPattern.DirectorWork;
import org.example.StrategyPattern.OfficeStaffWork;
import org.example.StrategyPattern.TeamLeaderWork;
import org.example.StrategyPattern.WorkStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Huy", "Nhân Viên VP");
        employee.work();

        System.out.println("=====================================");
        System.out.println("Apply State pattern");

        PositionState teamLeader = new TeamLeader();
        EmployeeStatePattern employeeStatePattern = new EmployeeStatePattern("Huy",teamLeader);
        employeeStatePattern.work();
        System.out.println("=====================================");
        System.out.println("=====================================");
        System.out.println("Apply Decorator pattern");


        EmployeeInteface employee1 = new EmployeeBasic("Nguyễn Văn A");
        System.out.println("\n🔹 Nhân viên bình thường:");
        employee1.work();

        // Nhân viên Văn Phòng
        EmployeeInteface employee2 = new OfficeStaffDecorator(new TeamLeaderDecorator(new EmployeeDecorator(new EmployeeBasic("Trần Văn B"))));
        System.out.println("\n🔹 Nhân viên Văn Phòng:");
        employee2.work();

        // Nhân viên Xưởng kiêm Đội Trưởng
        EmployeeInteface employee3 = new TeamLeaderDecorator(new EmployeeBasic("Lê Văn C"));
        System.out.println("\n🔹 Nhân viên Xưởng kiêm Đội Trưởng:");
        employee3.work();
        System.out.println("=====================================");


        System.out.println("=====================================");
        System.out.println("Apply Strategy pattern");

        WorkStrategy workStrategy = new DirectorWork("Nguyen Van B");
        workStrategy.executeWork();
        WorkStrategy workStrategy1 = new OfficeStaffWork();
        workStrategy1.executeWork();
        WorkStrategy workStrategy2 = new TeamLeaderWork();
        workStrategy2.executeWork();


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}