package com.coforge;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMainClass {

    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee("Shivranjan", 101, 67000, "Pune"));
        employeeList.add(new Employee("Atharva", 102, 62000, "Mumbai"));
        employeeList.add(new Employee("Sahil", 103, 58000, "Pune"));
        employeeList.add(new Employee("Yash", 104, 65000, "Dehradun"));
        employeeList.add(new Employee("Shriyansh", 105, 67000, "Agra"));
        employeeList.add(new Employee("Amit", 106, 55000, "Delhi"));
        employeeList.add(new Employee("Rahul", 107, 61000, "Noida"));
        employeeList.add(new Employee("Vivek", 108, 64000, "Lucknow"));
        employeeList.add(new Employee("Ankit", 109, 59000, "Indore"));
        employeeList.add(new Employee("Rohit", 110, 63000, "Jaipur"));

        System.out.println("Before Sorting\n");

        for(Employee e : employeeList) {
            System.out.println(e);
        }

        Collections.sort(employeeList);

        System.out.println("\nAfter Sorting By Name\n");

        for(Employee e : employeeList) {
            System.out.println(e);
        }
    }
}