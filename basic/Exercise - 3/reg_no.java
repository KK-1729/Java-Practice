import java.util.Scanner;

public class reg_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string_array[] = new String[5];
        System.out.println("Enter the 5 strings");
        for(int i = 0; i < 5; i++) {
            string_array[i] = input.nextLine();
        }
        input.close();
        String temp = "";
        for(int i = 0; i < 5; i++) {
            if(string_array[i].contains("BEC")) {
                for(int j = 0; j < 4; j++) {
                    if(string_array[j].compareTo(string_array[j+1]) > 0) {
                        temp = string_array[j];
                        string_array[j] = string_array[j+1];
                        string_array[j+1] = temp;
                    }
                }
            }
            else {
                System.out.println("Registration numbers should be of BEC branch");
                break;
            }
        }
        System.out.println("The rgistration numbers after sorting are");
        for(int i = 0; i < 5; i++) {
            System.out.println(string_array[i]);
        }
    }
}
