package org.launchcode.java.exercises.ArrayPractice;

public class OddNumbers {

        public static void main(String[] args) {
            int[] array = {1, 1, 2, 3, 5, 8};
            int counter = 0;

            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    System.out.print(array[i] + "\n");
                    continue;
                }
                //System.out.println("Not here");
            }
        }
}


