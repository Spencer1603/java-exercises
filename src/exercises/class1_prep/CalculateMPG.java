package exercises.class1_prep;

import java.util.Scanner;

public class CalculateMPG {
    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        double mpg;
        System.out.println("Enter the distance in miles you've travelled: ");
        double miles = in.nextDouble();
        System.out.println("Enter the amount of gas in gallons used: ");
        double gas = in.nextDouble();
        mpg = miles / gas;
        System.out.println("Your miles-per-gallon: " + mpg);
    }
}
