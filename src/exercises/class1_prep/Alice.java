package exercises.class1_prep;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        boolean found;

        String FIRST_SENTENCE = "Alice was beginning to get " +
                "very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she " +
                "had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";

        System.out.println("Search for: ");
        String search = in.nextLine();

        found = FIRST_SENTENCE.contains(search);
        System.out.println(found);
    }
}
