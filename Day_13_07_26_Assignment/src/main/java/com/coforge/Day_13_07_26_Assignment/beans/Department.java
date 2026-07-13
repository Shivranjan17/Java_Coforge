package com.coforge.Day_13_07_26_Assignment.beans;

import java.util.List;

public class Department {

    private int id;
    private String name;
    private String loc;
    private List<Employee> empList;

    public Department() {
        super();
    }

    public Department(int id, String name, String loc,
            List<Employee> empList) {
        super();
        this.id = id;
        this.name = name;
        this.loc = loc;
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "Department [id=" + id
                + ", name=" + name
                + ", loc=" + loc
                + ", empList=" + empList + "]";
    }
}