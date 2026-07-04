package com.coforge;

public class CountOccurrences {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 20, 40, 20, 50};

        int key = 20;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Number of Times Repeated : " + count);
    }
}