package com.pace.springcore.annotations.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=
			new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner scnr=new Scanner(System.in);
		Customer customer=(Customer)context.getBean("customer");
		Employee employee=(Employee)context.getBean("employee");
		customer.setId(1001);
		customer.setName("Abhi");
		customer.setCity("Bengaluru");
		System.out.println("Customer Details");
		customer.showCustomerDetails();
		
		employee.setId(101);
		employee.setName("Kumar");
		employee.setSalary(120000.00f);
		System.out.println("Employee Details");
		employee.showEmpDetails();
	}

}
