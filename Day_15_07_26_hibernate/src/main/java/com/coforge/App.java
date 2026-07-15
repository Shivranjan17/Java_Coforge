package com.coforge;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.config.AppConfig;
import com.coforge.entities.Employee;
import com.coforge.service.EmployeeService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       EmployeeService service = context.getBean(EmployeeService.class);
       
//       Employee e = new Employee();
//       e.setEname("Varun");
//       e.setSalary(700000);
//      service.addEmployee(e);
//       List<Employee> empList = service.getAllEmployees();
//       for(Employee emp:empList)
//    	   System.out.println(emp);
    	  
       
       
//       int id=126;
//       Employee emp = service.getEmployeeById(id);
//    		   System.out.println(emp);
       
       
       
//       Employee emp = new Employee(126,"SharadhChandra",800000);
//       if(service.updateEmployee(emp))
//    	   System.out.println("Employee Updated");
//       else
//    	   System.out.println("No Employee");
       
       int id = 126;
       if(service.deleteEmployee(id))
    	   System.out.println("Employee Deleted");
       else
    	   System.out.println("Employee Doesnt exist");
       
       
       List<Employee> empList = service.getAllEmployees();
       for(Employee emp1:empList)
 	   System.out.println(emp1);
    }
}
