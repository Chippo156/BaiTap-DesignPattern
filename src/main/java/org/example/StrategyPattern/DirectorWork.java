package org.example.StrategyPattern;

public class DirectorWork implements WorkStrategy{

    private String name;
    public DirectorWork(String name) {
        this.name = name;
    }
    @Override
    public void executeWork() {
        System.out.println(name   + ": Quản lý công ty.");
    }
}
