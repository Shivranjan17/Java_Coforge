package com.coforge.Day_03_07_26Prj;

public class HybridCar implements PetrolCar,ElectricCar {

	@Override
	public void provideAC() {
		// TODO Auto-generated method stub
		ElectricCar.super.provideAC();
		PetrolCar.super.provideAC();
		System.out.println("Hybrid car can provide AC in both modes");
	}

}
