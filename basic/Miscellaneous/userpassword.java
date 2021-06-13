import java.util.Scanner;

public class userpassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String username = input.nextLine();
        System.out.println("Enter password");
        String password = input.nextLine();
        System.out.println("Confirm password");
        String confirm = input.nextLine();
        input.close();

        if(username.length() < 8) {
            System.out.println("Invalid username length");
        }
        if(password.length() < 8) {
            System.out.println("Invalid password length");
        }
        if(username.contains(" ")) {
            System.out.println("Username should not contain spaces");
        }
        if(password.contains(" ")) {
            System.out.println("Password should not contain spaces");
        }
        if(password.equals(confirm) == false) {
            System.out.println("Password don't match");
        }
        String temp = "";
        for(int i = 0; i < username.length()-2; i++) {
            for(int j = 1; j < i+3; j++) {
                temp += username.charAt(j);
            }
            if(password.contains(temp)) {
                System.out.println("Password cannot contain username");
                break;
            }
            else {
                temp = "";
            }
        }
    }
}