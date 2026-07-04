package com.coforge;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 3, 4, 4, 5, 5, 6};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < arr.length; i++) {

            set.add(arr[i]);
        }

        System.out.println("Array After Removing Duplicates:");

        for (int num : set) {

            System.out.print(num + " ");
        }
    }
}