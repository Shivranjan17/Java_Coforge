package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        return Double.compare(e1.getSalary(), e2.getSalary());

    }
}