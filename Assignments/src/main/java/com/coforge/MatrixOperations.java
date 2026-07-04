package com.coforge;

import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = {
                {1, 2},
                {3, 4}
        };

        int b[][] = {
                {5, 6},
                {7, 8}
        };

        int result[][] = new int[2][2];

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");

        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();

        switch (choice) {

        case 1:

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }

            System.out.println("Addition:");

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

            break;

        case 2:

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    result[i][j] = a[i][j] - b[i][j];
                }
            }

            System.out.println("Subtraction:");

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

            break;

        case 3:

            for (int i = 0; i < 2; i++) {

                for (int j = 0; j < 2; j++) {

                    for (int k = 0; k < 2; k++) {

                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            System.out.println("Multiplication:");

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

            break;

        default:
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}