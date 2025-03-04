package org.example.StatePattern;

public class EmployeeStatePattern {
    private String name;
    private PositionState positionState;


    public EmployeeStatePattern(String name, PositionState position) {
        this.name = name;
        this.positionState = position;
    }
    public void setPositionState(PositionState positionState) {
        this.positionState = positionState;
    }

    public void work() {
        System.out.print(name + ": ");
        positionState.work();
    }

}
