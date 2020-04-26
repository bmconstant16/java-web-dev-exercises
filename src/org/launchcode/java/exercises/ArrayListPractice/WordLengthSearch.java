package org.launchcode.java.exercises.ArrayListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class WordLengthSearch {
        public static void main(String[] args) {

            //define the array list
            ArrayList<String> words = new ArrayList<>();
            //define the input
            Integer searchNumber;

            Scanner input = new Scanner(System.in);

            words.add("hello");
            words.add("tea");
            words.add("dream");
            words.add("Code");


            //System.out.println(words);
            System.out.println("Enter the length of words you want to search for");

            searchNumber = input.nextInt();

            //loop through each word in the array
            for (String word : words) {
                // for each word, return its length
                //System.out.println(number);
                if (word.length() == searchNumber) {
                    System.out.println(word);
                }
//            }
//            System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
            }


    }



}
