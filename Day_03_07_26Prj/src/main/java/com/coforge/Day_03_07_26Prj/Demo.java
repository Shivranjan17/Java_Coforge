package com.coforge.Day_03_07_26Prj;

public  class Demo {//extends not possible ,inheritance is not possible 
	
	final static String name="preeti";//final properties are constants 
	public  String sayHello(String name) {  //overriding not possible 
		
		return "Hello"+ name ;
		
	}
	public static String getName() {
		return name;
	}
}
