package org.example;

import org.example.ObserverPattern.Classroom;
import org.example.ObserverPattern.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Observer Pattern
        //Create a Classroom object
        Classroom classroom = new Classroom();
        classroom.attach(new Student("Hiep"));
        //Notify all students
        classroom.notification();

    }
}