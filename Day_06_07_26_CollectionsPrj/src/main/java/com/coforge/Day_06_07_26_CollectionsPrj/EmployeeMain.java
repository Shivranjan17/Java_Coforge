package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;


public class EmployeeMain {
	public static void main(String[] args) {
		
		
		
		
		List<Employee> employeeList = new LinkedList<Employee>();

		employeeList.add(new Employee("Shivranjan", 101, "Mumbai", "IT", 50000));
		employeeList.add(new Employee("Sahil", 102, "Pune", "HR", 45000));
		employeeList.add(new Employee("Yash", 103, "Delhi", "IT", 50000));
		employeeList.add(new Employee("Atharva", 104, "Mumbai", "Finance", 60000));
		employeeList.add(new Employee("Shriyansh", 105, "Bangalore", "IT", 55000));

		employeeList.add(new Employee("Shivranjan", 106, "Pune", "HR", 50000));
		employeeList.add(new Employee("Aniket", 107, "Delhi", "Sales", 45000));
		employeeList.add(new Employee("Sahil", 108, "Mumbai", "IT", 70000));
		employeeList.add(new Employee("Rohit", 109, "Chennai", "Finance", 60000));
		employeeList.add(new Employee("Yash", 110, "Bangalore", "IT", 55000));

		employeeList.add(new Employee("Sunny", 111, "Hyderabad", "Sales", 50000));
		employeeList.add(new Employee("Mahesh", 112, "Mumbai", "HR", 45000));
		employeeList.add(new Employee("Atharva", 113, "Pune", "IT", 70000));
		employeeList.add(new Employee("Rohit", 114, "Delhi", "Finance", 60000));
		employeeList.add(new Employee("Aniket", 115, "Bangalore", "IT", 55000));

		employeeList.add(new Employee("Mahesh", 116, "Chennai", "Sales", 50000));
		employeeList.add(new Employee("Sunny", 117, "Mumbai", "IT", 45000));
		employeeList.add(new Employee("Shivranjan", 118, "Hyderabad", "Finance", 70000));
		employeeList.add(new Employee("Yash", 119, "Pune", "Sales", 60000));
		employeeList.add(new Employee("Sahil", 120, "Delhi", "IT", 55000));
		
		for(Employee emp:employeeList)
			System.out.println(emp);
		//Collections.sort(employeeList);
		//Collections.sort(employeeList, new CityComparator());
		//Collections.sort(employeeList, new DepartmentComparator());
		//Collections.sort(employeeList, new SalaryComparator());
		//System.out.println("After Sorting...");
		//for(Employee emp : employeeList)
			//System.out.println(emp);
		Collections.sort(employeeList);
        System.out.println("After sorting");
        System.out.println(employeeList);
        
        
        employeeList.sort(new CityComparator()
        		.thenComparing(new DepartmentComparator()
        				.thenComparing(new SalaryComparator())));
        
        System.out.println("After sorting on city, dept and salary:");
        for(Employee emp:employeeList)
        	System.out.println(emp);
	}

}

