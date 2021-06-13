import java.util.Scanner;

public class adding_two_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int exit = 0;
        while(exit == 0) {
            System.out.println("Enter two numbers");
            int a = input.nextInt();
            int b = input.nextInt();
            int sum = a + b;
            System.out.println("The sum of the numbers is: " + sum);
            System.out.println("Do you want to exit(1/0)?");
            int option = input.nextInt();
            exit = option;
        }
        input.close();
        System.out.println("Exited Successfully!");
    }
}
