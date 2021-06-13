import java.util.Scanner;

public class odd_sum{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = input.nextInt();
        int r = 0;
        while(n != 0) {
            int d = n % 10;
            r = r * 10 + d;
            n /= 10;
        }
        int s = n + r;
        input.close();
        if(s % 2 == 0) {
        	System.out.println("No odd sum");
    	} 
        else {
    		System.out.println("Odd sum");
    	}
	}
}
