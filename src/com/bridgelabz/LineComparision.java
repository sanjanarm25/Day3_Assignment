package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line\n" +
                "Comparison Computation\n" +
                "Program on Master Branch");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();


        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));


        System.out.println("The length of the line segment is: " + length);
    }
}
