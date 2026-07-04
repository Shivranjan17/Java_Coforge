package com.coforge;

public class Employee implements Comparable<Employee> {

    private String name;
    private int id;
    private double salary;
    private String address;

    public Employee() {

    }

    public Employee(String name, int id, double salary, String address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary
                + ", address=" + address + "]";
    }

    @Override
    public int compareTo(Employee e) {

        // Sort by Employee Name

        return this.getName().compareTo(e.getName());
    }
}