package exercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a number for the length");
        length = input.nextInt();
        System.out.println("Enter a number for the width");
        width = input.nextInt();
        input.close();


//        System.out.println(length);
//        System.out.println(width);
        area = length*width;
        System.out.println("The area of the rectangle is " + area);


    }
}
