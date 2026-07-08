package com.coforge;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
 
public class InsertApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        
	        
	        String url="jdbc:mysql://localhost:3306/empdb";
	        String uname="root";
	        String pwd="root123";
	        //2
	        Connection con=DriverManager.getConnection(url,uname,pwd);
	        String qry = "INSERT INTO employeesalary VALUES (?, ?, ?, ?, ?)";
	       
	       PreparedStatement ps=con.prepareStatement(qry);
	       ps.setInt(1, 123);
	       ps.setString(2, "Atharva");
	       ps.setString(3, "IT");
	       ps.setDouble(4, 69889.0);
	       LocalDate localDate = LocalDate.now();
	       ps.setDate(5, Date.valueOf(localDate));
 
	       ps.executeUpdate();
		
	}
 
}