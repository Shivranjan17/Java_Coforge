package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapMain {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map =
                new LinkedHashMap<>();

        map.put(101, "Shivranjan");
        map.put(102, "Sahil");
        map.put(103, "Yash");
        map.put(104, "Atharva");
        map.put(105, "Shriyansh");

        map.put(106, "Aniket");
        map.put(107, "Rohit");
        map.put(108, "Sunny");
        map.put(109, "Mahesh");
        map.put(110, "Yash");

        System.out.println(map);

        System.out.println("Keys : " + map.keySet());

        System.out.println("Values : " + map.values());

        System.out.println("Entries : " + map.entrySet());

        for(Entry<Integer,String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}