package org.example.StatePattern;

public class OfficeStaff implements PositionState{
    @Override
    public void work() {
        System.out.println("Pha và phê.");
    }
}
