import java.util.Scanner;

public class words_frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();
        input.close();
        String arr[] = s.split(" ");
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                String temp = arr[j];
                String temp1 = arr[i];
                if(j < i && temp.contentEquals(temp1)) {
                    break;
                }
                if(temp.contentEquals(temp1)) {
                    count += 1;
                }
                if(j == arr.length-1) {
                    System.out.println(arr[i] + " occurs " + count + " times");
                }
            }
        }
    } 
}
