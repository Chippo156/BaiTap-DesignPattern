package org.example.StatePattern;

public class Director implements PositionState{

    @Override
    public void work() {
        System.out.println("Quản lý công ty.");
    }
}
