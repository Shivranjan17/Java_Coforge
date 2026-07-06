package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Comparator;

public class CityComparator implements Comparator<Employee> {


	 @Override
	    public int compare(Employee e1, Employee e2) {
	        return e1.getCity().compareTo(e2.getCity());
	    }

}