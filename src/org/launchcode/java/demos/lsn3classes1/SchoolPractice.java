package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {

    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student brett = new Student();
//        Student holly = new Student("holly");
        Student darlene = new Student("darlene", 1234, 1, 4.0);
//        Hello hello = new Hello();

        //setter the things here?
//
//        String name = "Brett";
//        int StudentId = 1235;
//        int numberOfCredits = 5;
//        double gpa = 6.0;

//        System.out.println(hello.greeting);

        System.out.println(darlene.getName());
        System.out.println(darlene.getStudentId());
        System.out.println(darlene.getNumberOfCredits());
        System.out.println(darlene.getGpa());
//        brett.setNumberOfCredits(5);
//        System.out.println(brett.getNumberOfCredits());

//        System.out.println(holly);
//        System.out.println(brett.getStudentId());
//        System.out.println(brett.getNumberOfCredits());
//        System.out.println(brett.getGpa());
//        hello.printGreeting();

    }
}
