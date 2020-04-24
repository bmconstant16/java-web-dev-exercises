package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public static void main(String[] args) {
        // create the string
        String hiddenQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing " +
                "that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward " +
                "from there.";

        // turn the string into an array
        char[] charactersInString = hiddenQuote.toCharArray();
        //System.out.println(charactersInString);

        // create the hashmap
        HashMap<Character, Integer> characters = new HashMap<>();
        int counter = 0;

        //    Loop through the string one character at a time in charactersinstring
        for (int i = 0; i < charactersInString.length; i++) {
//              counter = 0;
//           // if non-alphabetic character
//
//            System.out.print(counter);
            //    Store and/or update the count for a given character using an appropriate data structure.
            // if it's a new character in hashmap store the character and set counter at 1;
            if (characters.containsKey(charactersInString[i])) {
                characters.put(charactersInString[i], characters.get(charactersInString[i]) + 1);
            } else {
                characters.put(charactersInString[i], 1);
            }
            //else if it's already in there, add +1 to the key;

            //characters.put(charactersInString[i], i);
            //System.out.print(charactersInString[i] + "\n");
            //System.out.print(characters);

        }

        //    Loop through the data structure to print the results (one character and its count per line).
        for (Map.Entry<Character, Integer> pair : characters.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
//                sum += student.getValue();
        }


    }

}

// prompt user -add the scanner object in here
// .toLowerCase
