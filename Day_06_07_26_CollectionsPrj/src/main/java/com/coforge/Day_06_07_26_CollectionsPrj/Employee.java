package com.coforge.Day_06_07_26_CollectionsPrj;

public class Employee  implements Comparable<Employee> {
	
	private String ename ;
	private int eid;
	public Employee(String ename, int eid, String city, String dept, double salary) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.city = city;
		this.dept = dept;
		this.salary = salary;
	}
	private String city;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", city=" + city + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private String dept;
	private double salary;
	
	public int compareTo(Employee e) {
		return this.getEname().compareTo(e.getEname());
	}
	

}
