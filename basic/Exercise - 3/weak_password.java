import java.util.Scanner;

public class weak_password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String username = input.nextLine();
        System.out.println("Enter password");
        String password = input.nextLine();
        input.close();
        for(int i = 0; i < username.length()-2; i++) {
            String temp = username.substring(i, i+3);
            if(password.indexOf(temp) != -1) {
                System.out.println("Weak Password");
            }
        }
    }
}
