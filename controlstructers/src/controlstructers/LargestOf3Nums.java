package controlstructers;

import java.util.Scanner;
public class LargestOf3Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int num1,num2,num3;
		//read 3 values
		System.out.println("Enter 1st no");
		num1=scnr.nextInt();
		System.out.println("Enter 2nd no");
		num2=scnr.nextInt();
		System.out.println("Enter 3rd no");
		num3=scnr.nextInt();
		if(num1>num2&&num1>num3) {
			System.out.println(num1);
		}
		if(num2>num1&&num2>num3) {
			System.out.println(num2);
		}
		if(num3>num1&&num3>num2) {
			System.out.println(num3);
		}
		
		
		scnr.close();
		
	}

}
