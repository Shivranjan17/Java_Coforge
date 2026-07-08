package com.coforge;

import java.util.List;
import java.util.function.Function;
import java.util.Arrays;

public class FunctionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> function=(n)->n*5;
		System.out.println(function.apply(12));
		System.out.println("*******************");
		
		Integer arr[]= {23,12,23,45,78,90,56,66,86};
		List<Integer>list=Arrays.asList(arr);
		for(Integer n:list)
			System.out.println(function.apply(n));
		System.out.println("*********************");
		
		String[] names= {"Atharva","Shivranjan","Sahil","Ayush","Mani","Yash","Nayan"};
		List<String> namesList=Arrays.asList(names);
		Function<String,String> function1=(n)->n.toUpperCase();
		for(String name:namesList)
				System.out.println(function1.apply(name));
		//map on streams will take function as a parameter

	}

}

