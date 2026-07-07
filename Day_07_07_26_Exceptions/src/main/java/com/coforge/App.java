package com.coforge;


public class App {
	
	
	
	public static void div(int a,int b) {//propagation of exception
		if(b==0)
			throw new ArithmeticException();
		else
			System.out.println(a/b);
	}
	
	
	
	
    public static void main(String[] args) {
    	try {
    	div(5,0);
    	}
    	catch(Exception e) {
    		
    	}
    	System.out.println("Program completed ");
    	
    	
    	
//      int a = 78 , b[]= null ,c=0; String s = null;
//      try {
////    	  for(int i=0;i<b.length;i++)
////       c = a/b[i];
//    	  System.out.println(s.charAt(0));
//      }
//      catch(ArithmeticException e) {
//    	  e.printStackTrace();
//      }
//      catch(ArrayIndexOutOfBoundsException ae) {
//    	  ae.printStackTrace();
//    	 
//      }
//
////      catch(NullPointerException ne) {
////            ne.printStackTrace();
////            System.out.println(ne.getMessage());
////        }
////
////      catch(RuntimeException e) {
////    	  e.printStackTrace();
////      }
//      catch(Exception e) {
//    	  e.printStackTrace();
//      }
//      finally {
//    	  System.out.println("After try catch");
//      }
//      System.out.println(c);
      
    }
}
