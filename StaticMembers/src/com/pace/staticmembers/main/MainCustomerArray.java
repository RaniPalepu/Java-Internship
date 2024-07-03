package com.pace.staticmembers.main;

import com.pace.staticmembers.Customer;

public class MainCustomerArray {
	
	
	public static void main(String[] args) {
		Customer customers[]=new Customer[2];
		//Array is created but not the objects
//		for(Customer customer:customers) {
//			System.out.println(customer.getId());
//			System.out.println(customer.getName());
//			System.out.println(customer.getBillAmnt());
//			
//		}
		customers[0]=new Customer(1234,"Nesha",573425.25f);
		customers[1]=new Customer(1111,"sagar",3675143.65f);
		System.out.println(customers[0]);
		System.out.println(customers[1]);

	}

}
