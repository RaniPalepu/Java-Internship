
import java.util.Scanner;

public class LargeOf10Num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int num,large;
		System.out.println("enter the first number");
		num=scnr.nextInt();
		large=num;
		for(int counter=2;counter<=10;counter++) {
			System.out.println("enter the next number");
			num=scnr.nextInt();
			if(num>large) {
				large=num;
			}
		}
		System.out.println("largest no:"+large);

	}

}
