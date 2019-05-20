package exercises.class1_prep;

import java.util.Scanner;

public class CalculateRectangleArea {

    public static void main(String[] args) {
        Scanner in;
        in = new Scanner(System.in);
        double area;
        System.out.println("Enter the width of the rectangle: ");
        double width = in.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double height = in.nextDouble();
        area = width * height;
        System.out.println("The area of this rectangle is: " + area);
    }
}
