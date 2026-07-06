package com.coforge.Day_06_07_26_CollectionsPrj;
import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 1;i<=10;i++)
			//stack.add((int)(Math.round(Math.random()*100)));//remember this for otp (logic)
			//stack.add((int)(Math.round(Math.random()*100)));
			stack.push(i*3);
		System.out.println(stack);
		//System.out.println(stack.pop());
		
		System.out.println(stack.search(15));//will not return index 
		
	}

}
