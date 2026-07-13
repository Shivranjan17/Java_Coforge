package com.coforge.Day_13_07_26_Assignment.beans;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private String mobile;
    private String email;

    public Employee() {
        super();
    }

    @Override
    public String toString() {
        return "\nEmployee [id=" + id + ", name=" + name
                + ", salary=" + salary + ", mobile=" + mobile
                + ", email=" + email + "]";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}