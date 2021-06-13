import java.util.Scanner;

public class multiplication_table {
	public static void main(String[] args) {
	    System.out.print("Enter a number");
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
		input.close();
	    System.out.println("Multiplication table of " + n + " is : ");
	    for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n*i));
		}
	    
	}
}
