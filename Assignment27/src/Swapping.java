import java.util.Scanner;

//Swapping two numbers without using third variable
public class Swapping {

	public static void main(String[] args) {
		int num1,num2;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter num1");
		num1=scnr.nextInt();
		System.out.println("Enter num2");
		num2=scnr.nextInt();
		System.out.println("Before swapping:"+num1+","+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping:"+num1+","+num2);
		

	}

}
