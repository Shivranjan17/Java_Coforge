package com.coforge;

import java.util.Arrays;

public class DeleteElement {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int index = 2;

        int newArr[] = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {

            if (i == index)
                continue;

            newArr[j++] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}