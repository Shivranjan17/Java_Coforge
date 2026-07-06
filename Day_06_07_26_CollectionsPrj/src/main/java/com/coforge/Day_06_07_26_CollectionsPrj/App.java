package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;


public class App {
    public static void main(String[] args) {
    	LinkedList<String> namesList = new LinkedList<String>();
    	namesList.add("Shivranjan");
    	namesList.add("Sahil");
    	namesList.add("Yash");
    	namesList.add("Atharva");
    	namesList.add("Shriyansh");
    //	namesList.add(null);
    //	namesList.add(null);
    	
    	System.out.println(namesList);
    	System.out.println("*********************");
    	namesList.addFirst("Mahesh");
    	namesList.addLast("Aniket");//returns void value 
    	System.out.println(namesList);
    	System.out.println("*********************");
//    	Iterator<String> itr = namesList.iterator();
//    	while(itr.hasNext())
//    		System.out.println(itr.next());
    	System.out.println("*********************");
    	Iterator itr = namesList.descendingIterator();
    	while(itr.hasNext())
    		System.out.println(itr.next());
    	System.out.println("*********************");
    	
    	System.out.println(namesList.element());
    	System.out.println("*********************");
    	//namesList.offer("Mona");
    	System.out.println(namesList.offer("Mona"));//returns true if object added 
    	System.out.println(namesList.offerFirst("Sunny"));
    	System.out.println(namesList);
    	System.out.println("*********************");
    	System.out.println("Peek name or First name :"+namesList.peek());
    	System.out.println("Peek name or First name :"+namesList.peekLast());
    	System.out.println("*********************");
    	LinkedList<String> list = namesList.reversed();
    	System.out.println(list);
    	
    	System.out.println(namesList.contains("Yash"));

    	System.out.println("*********************");

    	for(String name : namesList)
    	    System.out.println(name);

    	System.out.println("*********************");

    	namesList.add(2,"Mona");
    	System.out.println(namesList);

    	System.out.println("*********************");

    	namesList.remove("Sahil");
    	System.out.println(namesList);

    	System.out.println("*********************");

    	namesList.remove(0);
    	System.out.println(namesList);

    	System.out.println("*********************");

    	System.out.println(namesList.get(2));

    	System.out.println("*********************");

    	System.out.println(namesList.indexOf("Yash"));

    	System.out.println("*********************");

    	System.out.println(namesList.lastIndexOf(null));

    	System.out.println("*********************");

    	System.out.println(namesList.size());
    	System.out.println("*********************");
    	
    	Collections.sort(namesList);
    	System.out.println(namesList);
    	System.out.println("*********************");
    	
    	

    }
}
