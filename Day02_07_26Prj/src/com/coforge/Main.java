package com.coforge;

//concept--Inheritance
public class Main {
	
	public static void main(String[] args) {
		
//		EmployeeClass ec1=new EmployeeClass("Shivranjan", 23, "Pune", 123, 660000);
//		System.out.println(ec1);
//		
//		Student s1=new Student("Atharva", 23, "Mumbai", 345, "CSE", "MITWPU");
//		System.out.println(s1);
//		
//		//System.out.println(ec1.sayHello());
//		System.out.println(s1.sayHello("9090909090"));
		
		
		Person p=new Person();
		System.out.println(p);
		System.out.println(p.sayHello("1234567890"));
		p=new Student();//runtime
		System.out.println(p);
		System.out.println(p.sayHello("909090909090"));
		p=new EmployeeClass();
		System.out.println(p);
		
		
		
		
		
		
		
	}

}
