
package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class EmployeeHashSetMain {

    public static void main(String[] args) {

        LinkedHashSet<Employee> employeeSet = new LinkedHashSet<>();

        employeeSet.add(new Employee("Shivranjan", 101, "Mumbai", "IT", 50000));
        employeeSet.add(new Employee("Sahil", 102, "Pune", "HR", 45000));
        employeeSet.add(new Employee("Yash", 103, "Delhi", "IT", 50000));
        employeeSet.add(new Employee("Atharva", 104, "Mumbai", "Finance", 60000));
        employeeSet.add(new Employee("Shriyansh", 105, "Bangalore", "IT", 55000));

        employeeSet.add(new Employee("Shivranjan", 106, "Pune", "HR", 50000));
        employeeSet.add(new Employee("Aniket", 107, "Delhi", "Sales", 45000));
        employeeSet.add(new Employee("Sahil", 108, "Mumbai", "IT", 70000));
        employeeSet.add(new Employee("Rohit", 109, "Chennai", "Finance", 60000));
        employeeSet.add(new Employee("Yash", 110, "Bangalore", "IT", 55000));

        employeeSet.add(new Employee("Sunny", 111, "Hyderabad", "Sales", 50000));
        employeeSet.add(new Employee("Mahesh", 112, "Mumbai", "HR", 45000));
        employeeSet.add(new Employee("Atharva", 113, "Pune", "IT", 70000));
        employeeSet.add(new Employee("Rohit", 114, "Delhi", "Finance", 60000));
        employeeSet.add(new Employee("Aniket", 115, "Bangalore", "IT", 55000));

        employeeSet.add(new Employee("Mahesh", 116, "Chennai", "Sales", 50000));
        employeeSet.add(new Employee("Sunny", 117, "Mumbai", "IT", 45000));
        employeeSet.add(new Employee("Shivranjan", 118, "Hyderabad", "Finance", 70000));
        employeeSet.add(new Employee("Yash", 119, "Pune", "Sales", 60000));
        employeeSet.add(new Employee("Sahil", 120, "Delhi", "IT", 55000));

        System.out.println("Employees in HashSet:");

        for(Employee emp : employeeSet)
        {
            System.out.println(emp);
        }
        
        //we cant directly apply sort method ,either set need to be converted 
        //list or to a treeset
        List<Employee> empList = new ArrayList(employeeSet);
        Collections.sort(empList);
        System.out.println("--------------------------------------------------------------------");
        for(Employee e:empList)
        	System.out.println(e);
        
    }
}