import java.util.Scanner;

public class input_mismatch {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter an integer");
            int a = input.nextInt();
            input.close();
            System.out.println(a);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
