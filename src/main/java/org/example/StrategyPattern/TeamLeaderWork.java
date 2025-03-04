package org.example.StrategyPattern;

public class TeamLeaderWork implements WorkStrategy{
    @Override
    public void executeWork() {
        System.out.println("Đi tuần tra và giao việc cho nhân viên.");

    }
}
