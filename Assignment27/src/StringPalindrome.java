import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String str,reverse="";
		int length;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter the String:");
		str=scnr.next();
		length=str.length();
		for(int index=length-1;index>=0;index--) {
			reverse=reverse+str.charAt(index);
		}
		if(str.equals(reverse)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not Palindrome");
		}

	}

}
