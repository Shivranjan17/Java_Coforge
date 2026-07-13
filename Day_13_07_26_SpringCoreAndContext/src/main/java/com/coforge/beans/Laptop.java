package com.coforge.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Component("lap")
public class Laptop {
	
	
//	@Value("Dell")
	@Value("${Laptop.brand}")
	private String brand;
//	@Value("80000")
	@Value("${Laptop.price}")
	private double price;
//	@Value("512GB")
	@Value("${Laptop.ramCapacity}")
	private String ramCapacity;
//	@Value("2TB")
	@Value("${Laptop.hardDiskCapacity}")
	private String hardDiskCapacity;
//	@Value("512GB")
	@Value("${Laptop.ssdCapacity}")
	private String ssdCapacity;
//	@Value("Metalic Gray")
	@Value("${Laptop.colour}")
	private String colour;
	
	@Autowired
	private Manufacture manufacture;
	public Laptop(String brand, double price, String ramCapacity, String hardDiskCapacity, String ssdCapacity,
			String colour, Manufacture manufacture) {
		super();
		this.brand = brand;
		this.price = price;
		this.ramCapacity = ramCapacity;
		this.hardDiskCapacity = hardDiskCapacity;
		this.ssdCapacity = ssdCapacity;
		this.colour = colour;
		this.manufacture = manufacture;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", ramCapacity=" + ramCapacity + ", hardDiskCapacity="
				+ hardDiskCapacity + ", ssdCapacity=" + ssdCapacity + ", colour=" + colour + ", manufacture="
				+ manufacture + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRamCapacity() {
		return ramCapacity;
	}
	public void setRamCapacity(String ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
	public String getHardDiskCapacity() {
		return hardDiskCapacity;
	}
	public void setHardDiskCapacity(String hardDiskCapacity) {
		this.hardDiskCapacity = hardDiskCapacity;
	}
	public String getSsdCapacity() {
		return ssdCapacity;
	}
	public void setSsdCapacity(String ssdCapacity) {
		this.ssdCapacity = ssdCapacity;
	}
	public String getColour() { 
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Manufacture getManufacture() {
		return manufacture;
	}
	public void setManufacture(Manufacture manufacture) {
		this.manufacture = manufacture;
	}
	
	
	
	

}
