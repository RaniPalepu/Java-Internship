package com.pace.collections.list;

import java.util.ArrayList;

public class MainEmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float totalSalary=0;
		Employee kumar=new Employee(1254,"Kumar",10524.25f);
		Employee ram=new Employee(15268,"Ram",75644.25f);
		Employee anthony=new Employee(1914,"Anthony",136524.25f);
		ArrayList<Employee>empList=new ArrayList<Employee>();
		//add employee objects
		empList.add(kumar);
		empList.add(ram);
		empList.add(anthony);
		for(Employee emp:empList) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
		for(Employee emp:empList) {
			totalSalary=totalSalary+emp.getSalary();
		}
		System.out.println("Total Salary:"+totalSalary);
	}

}
