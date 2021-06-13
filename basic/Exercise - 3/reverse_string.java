import java.util.Scanner;

public class reverse_string {
    public static void string_reverse(String str) {
        String letters[] = str.split(" ");
        String reverse_string = "";
        for(int i = 0; i < letters.length; i++) {
            String words = letters[i];
            String word_reverse = "";
            for(int j = words.length()-1; j >= 0; j--) {
                word_reverse += words.charAt(j);
            }
            reverse_string += word_reverse + " ";
        }
        System.out.println(reverse_string);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();
        input.close();
        System.out.println("The reverse of the string is");
        string_reverse(s);
    } 
}
