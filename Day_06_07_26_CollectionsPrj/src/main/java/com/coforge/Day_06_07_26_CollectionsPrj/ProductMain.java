package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

TreeSet<Product> productSet = new TreeSet<>();

        productSet.add(new Product(101, "5000", "Laptop", 10));
        productSet.add(new Product(102, "25000", "Mobile", 20));
        productSet.add(new Product(103, "1500", "Keyboard", 30));
        productSet.add(new Product(104, "800", "Mouse", 40));
        productSet.add(new Product(105, "3000", "Headphone", 15));
        productSet.add(new Product(106, "45000", "TV", 5));
        productSet.add(new Product(107, "12000", "Tablet", 12));
        productSet.add(new Product(108, "2000", "Speaker", 25));
        productSet.add(new Product(109, "1000", "Pendrive", 50));
        productSet.add(new Product(110, "3500", "Printer", 8));

        System.out.println("Products in TreeSet:");

        for(Product p : productSet)
        {
            System.out.println(p);
        }
        
        System.out.println("------------------------------------------------------------------------------");
        
    	TreeSet<Integer> tree = new TreeSet<Integer>();
    	tree.add(67);
    	tree.add(34);
    	tree.add(28);
    	tree.add(31);
    	tree.add(11);
    	tree.add(56);
    	tree.add(31);
    	tree.add(89);
    	tree.add(99);
    	System.out.println(tree);
    	 System.out.println("------------------------------------------------------------------------------");
    	Set<Integer> set = tree.descendingSet();
    	System.out.println(set);
    	 System.out.println("------------------------------------------------------------------------------");
    	
    	Iterator<Integer> itr = tree.descendingIterator();
    	while(itr.hasNext())
    	System.out.println(itr.next());
    	 System.out.println("------------------------------------------------------------------------------");
    	
    	System.out.println(tree.ceiling(28));//will return nearest large element of the given element
    	 System.out.println("------------------------------------------------------------------------------");
    	System.out.println(tree.floor(28));//nearest small element
    	 System.out.println("------------------------------------------------------------------------------");
    	System.out.println(tree.floor(10));//no further min,null will be returned 
    	 System.out.println("------------------------------------------------------------------------------");
    	System.out.println(tree.ceiling(31));
    	 System.out.println("------------------------------------------------------------------------------");
    	System.out.println(tree.floor(31));
    	 System.out.println("------------------------------------------------------------------------------");
    	 System.out.println(tree.lower(28));
    	 System.out.println("------------------------------------------------------------------------------");
    	  System.out.println(tree.higher(28));
    	 System.out.println("------------------------------------------------------------------------------");
    	 System.out.println(tree.higher(31));
    	 System.out.println("------------------------------------------------------------------------------");
    	 System.out.println(tree.lower(31));
    	 
    	
    	
    

	
	
	

	

}

}
