package org.example.StrategyPattern;

public class OfficeStaffWork implements WorkStrategy{
    @Override
    public void executeWork() {
        System.out.println("Làm việc văn phòng.");
    }
}
