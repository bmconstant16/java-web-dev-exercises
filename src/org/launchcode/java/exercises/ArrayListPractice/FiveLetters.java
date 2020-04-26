package org.launchcode.java.exercises.ArrayListPractice;

import java.util.ArrayList;

public class FiveLetters {
    public static void main(String[] args) {

        //define the array list
        ArrayList<String> words = new ArrayList<>();
//            Integer EvenSum = 0;

        words.add("hello");
        words.add("tea");
        words.add("dream");
        words.add("Code");


        //System.out.println(words);

        //loop through each word in the array
        for (String word : words) {
            // for each word, return its length
            //System.out.println(number);
            if (word.length() == 5) {
                System.out.println(word);
            }
//            }
//            System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
        }

    }
}
