package com.coforge;

import java.io.IOException;




public class LoginSessionDemo {
	
	public static void validate(String uname,String pwd) {
		if(uname.equals("Shivu")&&pwd.equals("shiv123"))
		try(LoginSession session = new LoginSession()){
			session.login();
			session.accessPages();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		else
			System.out.println("Invalid Credentials,No session");

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uname = "Shivu",pwd="Shiv123";
		validate(uname,pwd);
		
	}

}
