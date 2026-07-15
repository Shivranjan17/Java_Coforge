package com.coforge;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.entities.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
        		.configure("hibernate.cfg.xml")
        		.buildSessionFactory();
        
        Session session = factory.openSession();
      
       //addEmployee
        //Employee e1 = new Employee(123,"Shiva",2322222);
//        Employee e1 = new Employee();
//        e1.setEname("Atharva");
//        e1.setSalary(75000);
      Transaction transaction = session.beginTransaction();
//    //    session.save(e1);
//        session.persist(e1);
//        transaction.commit();
        
//        
//        //update Employee
//        
//        int id = 126;
//        Employee emp =session.get(Employee.class, id);
//        if(emp!=null) {
//        	emp.setEname("Sharadh");
//        	emp.setSalary(28383883);
//        	session.update(emp);
//        	transaction.commit();
//        }
//        else {
//        	System.out.println("No Employee with this id to update");
//        }
        
      
      
      //deleteEmployee
      int id = 128;
      Employee emp = session.get(Employee.class, id);
      if(emp != null) {
    	  session.delete(emp);
    	  //session.remove(emp);
    	  System.out.println("Employee Deleted");
    	  transaction.commit();
      }else {
    	  System.out.println("No employee with this id to delete");
      }
      
      
      
      
      
      
        //getAllEmployees
        List<Employee> empList = new ArrayList<Employee>();
        empList=session.createSelectionQuery("from Employee",Employee.class).getResultList();
        for(Employee e: empList)
        	System.out.println(e);
        
        
        
        //getEmployeeById
       // int id = 130;
//        Employee getEmp = session.get(Employee.class, id);
//        if(getEmp != null)
//        System.out.println("Selected Employee : "+getEmp);
//        else
//        	System.out.println("No Employees :"+id);
//        session.close();
//        factory.close();
        
        
        
    
        
    }
}
