package com.coforge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list =  Arrays.asList(arr);
		
		//Consumer<Integer> consumer = (ele)->System.out.println(ele);
		//consumer.accept(25);
		//list.forEach(consumer);
		
		list.forEach(ele ->System.out.println(ele));

	}

}
