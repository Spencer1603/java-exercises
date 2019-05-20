package exercises.class1_prep;

import java.util.Scanner;

public class ModifiedHello {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String user = in.next();
        System.out.println("Hello, " + user);
    }
}
