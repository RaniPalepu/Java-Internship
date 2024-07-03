package com.pace.staticmembers;
import com.pace.staticmembers.Customer;
public class MainCustomers {

	public static void main(String[] args) {
		Customer nesha=new Customer(1234,"Nesha",573425.25f);
		Customer mary=new Customer(1111,"sagar",3675143.65f);
		System.out.println(nesha.getId()+" "+nesha.getName()+" "+nesha.getBillAmnt());
		System.out.println(mary.getId()+" "+mary.getName()+" "+mary.getBillAmnt());
		System.out.println(Customer.companyName);
		System.out.println(nesha);
		System.out.println(mary.hashCode());
		boolean isEqual=nesha.hashCode()==mary.hashCode();
		System.out.println("nesha and mary objects are equal?"+isEqual);
		boolean isEqual2=nesha.equals(mary);
		System.out.println("nesha and mary objects are equal"+isEqual2);
		System.out.println(nesha);
		System.out.println(mary);
		
	}

}
