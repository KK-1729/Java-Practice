import java.util.Scanner;

public class password_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String username = input.nextLine();
        System.out.println("Enter password");
        String password = input.nextLine();
        System.out.println("Confirm your password");
        String confirm = input.nextLine();
        boolean valid = true;
        input.close();
        if(username.isEmpty()) {
            System.out.println("Username cannot be empty");
            valid = false;
        }
        if(password.isEmpty()) {
            System.out.println("Password cannot be empty");
            valid = false;
        }
        if(valid) {
            if(password.length() < 8) {
                System.out.println("Password cannot be less than 8 characters");
            }
            if(password.contains(username)) {
                System.out.println("Password is weak");
            }
            if(!password.equals(confirm)) {
                System.out.println("Passwords don't match");
            }
        }
    }
}
