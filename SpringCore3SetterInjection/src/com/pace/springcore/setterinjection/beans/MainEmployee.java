package com.pace.springcore.setterinjection.beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pace.springcore.setterinjection.beans.Employee;
public class MainEmployee {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=(Employee)context.getBean("emp");
		System.out.println(emp.getId()+"--"+emp.getName());
		System.out.println("Address of employee");

	}

}
