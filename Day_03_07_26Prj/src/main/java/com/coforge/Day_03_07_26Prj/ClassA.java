package com.coforge.Day_03_07_26Prj;

public class ClassA implements Interface1,Interface2 {
	public static void main(String[] Arg) {
		ClassA a = new ClassA();
		Interface1 i1 = new ClassA();
		Interface2 i2 = new ClassA();
		i1.sayHello();
		i2.sayHello();
		
		//a.sayHello();
	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello.....");
		
	}

}
