import java.util.Scanner;

public class equilateral_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of side of triangle");
        int s = input.nextInt();
        double area = (1.732/4) * s * s;
        input.close();
        System.out.println("The area of the equilateral triangle is: " + area + " units");
    }
}
