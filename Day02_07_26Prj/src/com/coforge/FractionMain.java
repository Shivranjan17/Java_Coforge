package com.coforge;

import java.util.Scanner;

public class FractionMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // First Fraction
        System.out.print("Enter numerator of first fraction: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter denominator of first fraction: ");
        double den1 = sc.nextDouble();

        Fractions f1 = new Fractions(num1, den1);

        // Second Fraction
        System.out.print("Enter numerator of second fraction: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter denominator of second fraction: ");
        double den2 = sc.nextDouble();

        Fractions f2 = new Fractions(num2, den2);

        // Addition
        double numerator =
                (f1.numerator * f2.denominator)
              + (f2.numerator * f1.denominator);

        double denominator =
                f1.denominator * f2.denominator;

        System.out.println("Sum = "
                + numerator + "/"
                + denominator);

        sc.close();
    }
}