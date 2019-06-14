package com.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHierarchy implements Employee{
	
	private List<Employee> empList = new ArrayList<Employee>();

	@Override
	public void getEmployeeDetails() {
		
		this.empList.forEach(emp -> emp.getEmployeeDetails());
		
	}
	
	public void addEmployee(Employee employee){
		this.empList.add(employee);
	}
	
	public void removeEmployee(Employee employee){
		this.empList.remove(employee);
	}

}
