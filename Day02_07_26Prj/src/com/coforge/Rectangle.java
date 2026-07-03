package com.coforge;

public class Rectangle extends Shape {
	 
    private double length;
    private double width;
 
    // Non-Parameterized Constructor
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }
 
    // Parameterized Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
 
    @Override
    public void area() {
        System.out.println("Area of Rectangle = " + (length * width));
    }
 
    @Override
    public void perimeter() {
        System.out.println("Perimeter of Rectangle = "
                + (2 * (length + width)));
    }
}
