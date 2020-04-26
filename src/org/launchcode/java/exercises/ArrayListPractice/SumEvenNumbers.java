package org.launchcode.java.exercises.ArrayListPractice;

import java.util.ArrayList;


public class SumEvenNumbers {
    public static void main(String[] args) {

        //define the array list
        ArrayList<Integer> numbers = new ArrayList<>();
        Integer EvenSum = 0;

        numbers.add(2);
        numbers.add(1);
        numbers.add(12);
        numbers.add(10);
        numbers.add(6);
        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(11);
        numbers.add(5);

        //System.out.println(numbers);

        //if the number is even, add it to itself
        for (Integer number : numbers) {
            //System.out.println(number);
            if (number%2 == 0) {
                EvenSum = EvenSum + number;
            }
        }
        System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
    }


}


