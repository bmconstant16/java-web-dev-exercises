package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input;

       input = new Scanner(System.in);
       System.out.println("Enter a radius");
       radius = input.nextDouble();

//        System.out.println(input.hasNextDouble());
//       if (input.hasNextDouble()) {
//           System.out.println("You must enter a positive number");
//        }

        while (radius < 0) {
            System.out.println("You must enter a positive number");
            System.out.println("Enter a radius");
            radius = input.nextDouble();
        }
//       input.close();

        Double message = Circle.getArea(radius);
        System.out.println(message);

//        double radius;
//        double pi;
//        double area;
//        Scanner input;
//        pi = 3.14;
//        radius = input.nextDouble();
//        input.close();
//
//
//        area = pi * radius * radius;
//        System.out.println("The area of a circle with radius " + radius + " is " + area);

    }

}
