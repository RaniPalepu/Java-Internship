package controlstructers;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int num,rem,counter=0;
		System.out.println("enter an integer");
		num=scnr.nextInt();
		if(num==0)
			counter++;
		while(num!=0) {
			rem=num%10;
			counter++;
			num=num/10;
		}
		System.out.println("no of digits"+counter);
		scnr.close();
	}

}
