package exercises;

import java.util.Scanner;

public class AliceReplace {
    public static void main(String[] args) {
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and " +
                "of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
//        String aliceQuoteChanged = "";
        int index;
        int length;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word you'd like to search");
        String search = input.nextLine();
        input.close();

//         System.out.println(aliceQuote.indexOf(search));
        index = aliceQuote.indexOf(search);
//        System.out.println(search.length());
        length = aliceQuote.indexOf(search);
        String[] aliceQuoteChanged = aliceQuote.split(search, length);
//        System.out.println(aliceQuoteChanged);
        for (String a : aliceQuoteChanged)
            System.out.println(a);

    }
}
