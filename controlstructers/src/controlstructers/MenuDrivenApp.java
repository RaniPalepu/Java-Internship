package controlstructers;

import java.util.Scanner;

public class MenuDrivenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1,num2,result=0;
		int choice;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter 1 no");
		num1=scnr.nextFloat();
		System.out.println("Enter 2 no");
		num2=scnr.nextFloat();
		do {
			System.out.println("Enter your choice:1.Add 2.Subract 3.Multiply 4.Divide 5.Exit");
			choice=scnr.nextInt();
			switch(choice) {
			case 1:
				result=num1+num2;
				break;
			case 2:
				result=num1-num2;
				break;
			case 3:
				result=num1*num2;
				break;
			case 4:
				result=num1/num2;
				break;
			
			}
		System.out.println("Result"+result);
		}while(choice!=5);
		scnr.close();
	}

}
