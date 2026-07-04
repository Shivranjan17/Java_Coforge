package com.coforge;

import java.util.ArrayList;

public class ResizableArray {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Before Adding:");
        System.out.println(list);

        list.add(40);
        list.add(50);

        System.out.println("After Adding:");
        System.out.println(list);
    }
}