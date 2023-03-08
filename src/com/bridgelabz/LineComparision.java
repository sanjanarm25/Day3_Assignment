package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {
    static double length1;
    static double length2;



    public double calculateLength(double x1,double y1,double x2,double y2){

        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return length;

    }

    public static void EqualityCheck(double length1,double length2){

        if(length2==length1){
            System.out.println("Lines are  equals...");
        }else if(length2 < length1){
            System.out.println("length1 is grater than length2");
        }else{
            System.out.println("length2 is is greater than length1");
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line\n" +
                "Comparison Computation\n" +
                "Program on Master Branch");
        LineComparision length=new LineComparision();
        double length1=length.calculateLength(14,16,11,14);
        System.out.println(length1);
        double length2=length.calculateLength(14,16,11,14);
        System.out.println(length2);
        EqualityCheck(length1,length2);

    }
}
