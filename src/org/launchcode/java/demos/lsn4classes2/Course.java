package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private int courseNumber;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;


    public Course (String topic, int courseNumber, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.courseNumber = courseNumber;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    //getters

    public String getTopic() {
        return topic;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    //setters
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return "Class: " + this.topic + " " + this.courseNumber + "\nInstructor Details: " + this.instructor + "Students enrolled: " + this.enrolledStudents;
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public boolean equals(Object toBeCompared) {

        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Course theCourse = (Course) toBeCompared;
        return theCourse.getTopic() == getTopic();
    }

//    public static void main(String[] args) { // <--- confused here
//        Teacher historyTeacher = new Teacher("John", "Doe", "History", 14);
//        Student newStudent = new Student("Sally", 12345, 35, 4.0);
//
//        ArrayList<Student> people = new ArrayList<>();
//        people.add(newStudent);

//        Course history = new Course("History", 101, historyTeacher.getFirstName() );
//        System.out.println("The Student class works! " + sally.getName() + " is a " + sally.getGradeLevel() + " student!");
//        System.out.println(sally);
//        sally.addGrade(12, 3.5);
//        System.out.println(sally);
//        sally.addGrade(25, 3.8);
//        System.out.println(sally);
//        System.out.println("The Student class works! " + sally.getName() + " is a " + sally.getGradeLevel() + " student!");


}

