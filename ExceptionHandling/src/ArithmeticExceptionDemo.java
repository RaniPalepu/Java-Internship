import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		int quotient,dividend,divisor;
		Scanner scnr=new Scanner(System.in);
		try {
			System.out.println("Enter the dividend");
			dividend=scnr.nextInt();
			System.out.println("enter divisor");
			divisor=scnr.nextInt();
			quotient=dividend/divisor;
			System.out.println("Quotient="+quotient);
  	} catch(ArithmeticException arthexcp) {//object is thrown by jvm
			System.out.println(arthexcp);
			System.out.println(arthexcp.getMessage());
  	}

	}

}
