package com.pace.springcore.constructorinjection;
public class Employee {
	int id;
	String name;
	Address address;
	
	Employee(int id,String name,Address address){
		
		this.id=id;
		this.name=name;
		this.address=address;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

}
