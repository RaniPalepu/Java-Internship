package controlstructers;

import java.util.Scanner;

public class SwitchStringCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country;
		Scanner scnr=new Scanner(System.in);
		System.out.println("enter USA or UK");
		country=scnr.next();
		switch(country) {
		default:
			System.out.println("Invalid string");
			break;
		case"USA":
		case"usa":
			System.out.println("United States Of America");
			break;
		case"UK":
		case"uk":
			System.out.println("United Kingdom");
			break;
		
		}
        scnr.close();
	}

}