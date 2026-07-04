package com.coforge;

public class EvenNumbersArray {

    public static void main(String[] args) {

        int arr[] = {10, 15, 20, 25, 30, 35, 40};

        System.out.println("Even Numbers:");

        for (int num : arr) {

            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}