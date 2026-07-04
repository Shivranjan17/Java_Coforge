package com.coforge;

public class PrimeNumberArray {

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 6, 7, 11, 12, 13};

        System.out.println("Prime Numbers:");

        for (int num : arr) {

            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {

                for (int i = 2; i <= Math.sqrt(num); i++) {

                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}