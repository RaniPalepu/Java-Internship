package com.pace.retail.main;
import com.pace.retail.Product;
public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product mobile=new Product(123,"iPhone",154234.25f);
		Product laptop=new Product(1556,"MAC BOOK",12486.18f);
		System.out.println("Mobile Phone Details");
		System.out.println(mobile.getid());
		System.out.println(mobile.getName());
		System.out.println(mobile.getPrice());
		//update the price
		mobile.setPrice(150000.00f);
		System.out.println(mobile.getPrice());
	}

}
