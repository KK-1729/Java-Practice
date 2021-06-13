import java.util.Scanner;

public class sum_of_numbers {
    public static void main(String[] args) {
        System.out.println("Enter a number n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++) {
            count += i;
        }
        input.close();
        System.out.println(count);
    }
}
