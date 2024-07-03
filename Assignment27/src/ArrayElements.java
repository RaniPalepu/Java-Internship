import java.util.Scanner;

public class ArrayElements {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		String[] citynames= new String[5];
		for(int index=0;index<=citynames.length-1;index++) {
			System.out.println("Enter the element at index:"+index);
			citynames[index]=scnr.next();
		}
		
	}

}
