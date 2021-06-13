import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println("The year is a leap year");
                }
                else {
                    System.out.println("The year is not a leap year");
                }
            }
            else {
                System.out.println("The year is a leap year");
            }  
        }
        else {
            System.out.println("The year is not a leap year");
        }
        input.close();
    }
}
