package com.coforge.Day_03_07_26Prj;

public interface ElectricCar {
	public default void provideAC() {
		System.out.println("Electric car provides smart AC");
	}

}
