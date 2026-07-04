package com.coforge;

public class BinarySearch {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        int key = 40;

        int low = 0;
        int high = arr.length - 1;

        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {

                System.out.println("Element Found at Index : " + mid);
                found = true;
                break;
            }

            else if (key < arr[mid]) {

                high = mid - 1;
            }

            else {

                low = mid + 1;
            }
        }

        if (!found) {

            System.out.println("Element Not Found");
        }
    }
}