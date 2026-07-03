package com.coforge.Day_03_07_26Prj;

public class CarMain {
	public static void main(String[] Arg) {
		Car car = new BMW();
		car.start();//Instance Method depends on object 
		car.stop();
		car.provideAC();
		Car.musicSystem();//Static methods belong to the class/interface itself, not to an object. thats why Car
		
		car = new Honda();
		car.start();
		car.stop();
		car.provideAC();
		Car.musicSystem();//Static methods belong to the class/interface itself, not to an object.
		
		
	}

}
