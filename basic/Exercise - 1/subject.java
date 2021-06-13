import java.util.Scanner;

public class subject {
	public static void main(String[] args) {
		int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        num = input.nextInt();
        switch(num) {
            case 823:
                System.out.println("Java Programming");
                break;
            case 824:
                System.out.println("Python Programming");
                break;
            default:
                System.out.println("Invalid Input");
        }
        input.close();
     }
     
}
