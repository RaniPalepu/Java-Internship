import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int temp;
		System.out.println("Enter temperature:");
		temp=scnr.nextInt();
		switch(temp) {
		case 0:
			System.out.println("ICE");
			break;
		case 100:
			System.out.println("STEAM");
			break;
		default:
			if (temp > 0 && temp < 100) {
                System.out.println("WATER");
            } else {
                System.out.println("Temp not valid.");
            }
			break;
		}
		
		
	}

}
