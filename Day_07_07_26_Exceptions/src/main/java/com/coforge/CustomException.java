package com.coforge;

public class CustomException {
	public static void main(String[] args) {
		Person p = new Person("Shiv",23,"Pune");
		try {
		if(p.getAge()<18)
			throw new AgeNotSufficientException("Person age is less than 18");
		else
			System.out.println("Person is eligible to cast vote");
		}

		  catch(AgeNotSufficientException e) {

		            System.out.println(e.getMessage());

		        }

	}

}
