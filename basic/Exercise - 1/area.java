import java.util.Scanner;

public class area {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = input.nextInt();
        double area = (3.14) * r * r;
        input.close();
        System.out.println("Area of circle is " + area + " units");
	}
}
