package com.coforge.Day_03_07_26Prj;

public interface PetrolCar {
	public default void provideAC(){
		System.out.println("Petrol Car provides normal AC");
		
	}

}
