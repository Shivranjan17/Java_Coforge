package com.coforge;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};

        int merged[] = new int[arr1.length + arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            merged[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[index++] = arr2[i];
        }

        Arrays.sort(merged);

        System.out.println("Merged Sorted Array:");

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}