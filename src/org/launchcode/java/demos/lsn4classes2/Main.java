package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        Teacher historyTeacher = new Teacher("John", "Doe", "History", 14);
        Student newStudent = new Student("Sally", 12345, 35, 4.0);

        ArrayList<Student> people = new ArrayList<>();
        people.add(newStudent);
        people.add(sally);

        Course history = new Course("History", 101, historyTeacher, people);

        System.out.println(history.toString());

//        System.out.println("The Student class works! " + sally.getName() + " is a " + sally.getGradeLevel() + " student!");
//        System.out.println(sally);
//        sally.addGrade(12, 3.5);
//        System.out.println(sally);
//        sally.addGrade(25, 3.8);
//        System.out.println(sally);
//        System.out.println("The Student class works! " + sally.getName() + " is a " + sally.getGradeLevel() + " student!");


    }
}
