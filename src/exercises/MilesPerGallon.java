package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        int miles;
        double gas;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the number of miles you've driven");
        miles = input.nextInt();
        System.out.println("Enter gallons of gas you've consumed");
        gas = input.nextInt();
        input.close();


//        System.out.println(length);
//        System.out.println(width);
        mpg = miles / gas;
        System.out.println("Your miles per gallon amount is " + mpg);


    }
}
