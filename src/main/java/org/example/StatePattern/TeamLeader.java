package org.example.StatePattern;

public class TeamLeader implements PositionState{
    @Override
    public void work() {
        System.out.println("Đi tuần và gán việc nhân viên.");
    }
}
