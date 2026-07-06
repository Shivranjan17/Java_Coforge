package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.List;
import java.util.Vector;
import java.util.Enumeration;

public class VectorMain {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		//vector.add(33);
		//vector.add(43);
		//vector.add(54);
		for(int i=1;i<=10;i++) {
			vector.add(i);}
			System.out.println(vector);
			System.out.println(vector.capacity());
			
			//ArrayList capacity is going to be increased by half of its original capacity when 
			//initial capacity gets exhausted
			
			vector.add(11);
			System.out.println(vector);
			System.out.println(vector.capacity());
		    
			Enumeration<Integer> enumeration = vector.elements();
			while(enumeration.hasMoreElements())
			System.out.println(enumeration.nextElement());//concurrent modifications
			//are not possible on enumeration on iterator 
			
		
		
	}

}
