package com.coforge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ArrayList  alist = new ArrayList();
//        alist.add(10);
//        alist.add("Shivranjan");//insertion order is preserved 
//        alist.add(22.22f);
//        alist.add(90.99);
//        alist.add(true);
//        alist.add(null);
//        alist.add(10);
//        alist.add(10);
//        alist.add(10);//Duplicate allowed 
//        alist.add(null);
//        alist.add(null);//null values allowed 
//        
//        System.out.println("ArrayList Elements are:");
//        for(int i = 1;i<alist.size();i++) {
//        	System.out.println (alist.get(i));
//        }
//        
          ArrayList<Integer> ilist = new ArrayList<Integer>();
        ilist.add(23);
        ilist.add(22);
        ilist.add(11);
        ilist.add(07);
        ilist.add(32);
        ilist.add(51);
       // ilist.add(null);
        ilist.add(3,77);
       
        System.out.println("ArrayList Elements are:");
      for(int i = 0;i<ilist.size();i++) {
      	System.out.println (ilist.get(i));
      }
//        
//      ArrayList<Integer> alist= new ArrayList<Integer>();
//      alist.add(22);
//      alist.add(33);
//      alist.add(44);
//      alist.addAll(2,alist);
//      System.out.println("ArrayList Elements are:");
//      for(int i = 0;i<alist.size();i++) {
//      	System.out.println (alist.get(i));
//      }
//      
//      
//      System.out.println(ilist.contains(1)); System.out.println("enhanced for loop");
//      System.out.println("********************");
//      for(Integer i:ilist)
//      System.out.println(i);
//      System.out.println("********************");
//      System.out.println(ilist.containsAll(alist));
//      System.out.println("********************");
//     // System.out.println(ilist.remove(0));//index value is removed 
//      
//      //Integer rem = 34;
//      System.out.println(ilist.remove(Integer.valueOf(34)));//object value
//      
//      
//      System.out.println("********************");
//      System.out.println(ilist.removeAll(alist));
//      System.out.println("********************");
//      for(Integer i:ilist)
//    	  System.out.println(i);
//      System.out.println("********************");
//      ilist.ensureCapacity(35);
//      System.out.println("********************");
//      ilist.forEach(i->System.out.println(i));
//      
//      System.out.println("********************");
//      List<Integer> list = ilist.reversed();
//      list.forEach(i->System.out.println(i));
//      System.out.println("********************");
//      ilist.addFirst(10);
//      ilist.addLast(100);
//      ilist.forEach(i->System.out.println(i));
//      
//      Iterator<Integer> itr=ilist.iterator();
//      while(itr.hasNext()) { } 
//      int value=itr.next(); if(value==32) itr.remove(); 
//      System.out.println(value);
//      System.out.println(ilist);
//    
      
//          System.out.println("***************ж");
//          ListIterator< Integer> itr=ilist.listIterator();
//          while(itr.hasNext())
//          System.out.println(itr.next());
//          System.out.println("***************");
//          System.out.println("Reversed List");
//          while(itr.hasPrevious())
//          System.out.println(itr.previous());
//          
          
          
//          System.out.println("Clone ArrayList");
//          System.out.println("***************");
//          ArrayList<Integer> clonedList=(ArrayList<Integer>) ilist.clone();
//          System.out.println(ilist.hashCode());
//          System.out.println(clonedList.hashCode());
//          clonedList.add(700);
//          ilist.add(500);
//          System.out.println(ilist.hashCode());
//          System.out.println(clonedList.hashCode());
          
        
        
      Collections.sort(ilist);//natural sorting order ,ascending order 
      System.out.println(ilist);
        
        
        
    }
}
