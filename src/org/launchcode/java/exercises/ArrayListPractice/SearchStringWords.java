package org.launchcode.java.exercises.ArrayListPractice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class SearchStringWords {
        public static void main(String[] args) {
            //define the string
            String sentence = "I would not could not in a box . I would not could not with a fox . I will not eat them in a house . I will not eat them with a mouse .";
            //split the string at the spaces
            String sentenceString[] = sentence.split(" ");

            //make an ArrayList
            List<String> words = new ArrayList<String>();
            words = Arrays.asList(sentenceString);

            //define the input
            Integer searchNumber;

            Scanner input = new Scanner(System.in);


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

