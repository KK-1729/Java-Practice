import java.util.Scanner;

public class check_name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String names_arr[] = new String[5];
        System.out.println("Enter 5 names");
        for(int i = 0; i < 5; i++) {
            names_arr[i] = input.nextLine();
        } 
        System.out.println("Enter the name you want to search");
        String name = input.nextLine();
        input.close();
        int count = 0;
        for(int i = 0; i < 5; i++) {
            if(names_arr[i].contains(name)){
                count += 1;
            }
        }
        if(count > 0) {
            System.out.println("Name Found");
        }
        else {
            System.out.println("Name no Found");
        }
    }
}
