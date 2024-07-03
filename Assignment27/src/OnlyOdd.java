import java.util.Scanner;

// Check if an integer has only odd digits
public class OnlyOdd {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the integer");
        int num = scnr.nextInt();

        if (OddDigits(num)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean OddDigits(int num) {
        while(num>0) {
            int digit=num % 10;
            if (digit%2==0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
