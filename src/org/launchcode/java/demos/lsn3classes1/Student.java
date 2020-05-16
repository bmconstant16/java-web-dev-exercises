package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //constructors
    //default

    public Student() {};

    public Student(String aName) {
        this.name = aName;
    }

    public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa) {
            this.name = aName;
            this.studentId = aStudentId;
            this.numberOfCredits = aNumberOfCredits;
            this.gpa = aGpa;
        }

    public Student(String aName, int aStudentId) {
        this.name = aName;
        this.studentId = aStudentId;
        this.numberOfCredits = 0;
        this.gpa = 0.0;
    }


    //getters
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    //setters

    public void setName(String aName) {
        this.name = aName;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    };

    public void setStudentId(int aStudentId) {
       this.studentId = aStudentId;
    }

    public void setGpa(int aGpa) {
        this.gpa = aGpa;
    }

    //instance method to return all the info from the object
    public String toString () {
        return this.name;
    }
}