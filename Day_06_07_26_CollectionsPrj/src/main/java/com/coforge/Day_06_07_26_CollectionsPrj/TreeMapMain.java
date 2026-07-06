package com.coforge.Day_06_07_26_CollectionsPrj;


import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Product> productMap = new TreeMap<Integer,Product>();

			productMap.put(101, new Product(101, "5000", "Laptop", 10));
			productMap.put(102, new Product(102, "25000", "Mobile", 20));
			productMap.put(103, new Product(103, "1500", "Keyboard", 30));
			productMap.put(104, new Product(104, "800", "Mouse", 40));
			productMap.put(105, new Product(105, "3000", "Headphone", 15));
			productMap.put(106, new Product(106, "45000", "TV", 5));
			productMap.put(107, new Product(107, "12000", "Tablet", 12));
			productMap.put(108, new Product(108, "2000", "Speaker", 25));
			productMap.put(109, new Product(109, "1000", "Pendrive", 50));
			productMap.put(110, new Product(110, "3500", "Printer", 8));	
			
			
			
			//System.out.println(productMap.entrySet());
			for(Entry<Integer,Product> entry : productMap.entrySet()) {
			    System.out.println(entry);
			}
			
			Set<Integer> set = productMap.descendingKeySet();
			for(Integer s :set) {
				System.out.println(s);
			}


	}

}
