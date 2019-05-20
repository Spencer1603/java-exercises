package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        double radius;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius:");
        radius = input.nextDouble();

        area = radius * radius * Math.PI;
        System.out.println("Area: " + area);
    }
}
