package com.designPattern.composite;

public class Manager implements Employee{
	
	private String name;
	private int empId;
	private double salary;
	private String title;

	public Manager(String n,int id, double sal, String position){
		this.name = n;
		this.empId = id;
		this.salary = sal;
		this.title = position;
	}

	@Override
	public void getEmployeeDetails() {
		System.out.println(toString());
		
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", empId=" + empId + ", salary=" + salary + ", title=" + title + "]";
	}

}
