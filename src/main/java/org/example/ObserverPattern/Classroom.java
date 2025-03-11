package org.example.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Classroom implements Subject{
    List<Observer> students = new ArrayList<>();

    public Classroom() {
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("Charlie"));
    }
    @Override
    public void attach(Observer observer) {
        students.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        students.remove(observer);
    }

    @Override
    public void notification() {
        for (Observer student : students) {
            student.update();
        }
    }
}
