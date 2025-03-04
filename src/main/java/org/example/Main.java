package org.example;

import org.example.NoPattern.Employee;
import org.example.StatePattern.EmployeeStatePattern;
import org.example.StatePattern.PositionState;
import org.example.StatePattern.TeamLeader;

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




        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}