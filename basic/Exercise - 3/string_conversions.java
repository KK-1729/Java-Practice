import java.util.HashMap;
import java.util.Scanner;

public class string_conversions {
    public static void stringToBinary(String str) {
        for(int i = 0; i < str.length(); i++) {
            int val = Integer.valueOf(str.charAt(i));
            String binary = "";
            while(val > 0) {
                if(val % 2 == 1) {
                    binary += "1";
                }
                else {
                    binary += "0";
                }
                val /= 2;
            }
            binary = reverse(binary);
            System.out.print(binary + " ");
        }
    }
    public static String reverse(String str) {
        char a[] = str.toCharArray();
        int j = a.length-1;
        for(int i = 0; i < j; i++) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return String.valueOf(a);
    }
    public static String stringToHexadecimal(String str) {
        String hex = "";
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int j = (int)c;
            String part = Integer.toHexString(j);
            hex += part;
        }
        return hex;
    }
    public static String hexToBinary(String str) {
        String binary = "";
        HashMap<Character, String> hashMap = new HashMap<Character, String>();
        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");
        String hex = str.toUpperCase();
        for(int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if(hashMap.containsKey(c)) {
                binary += hashMap.get(c);
            }
        }
        return binary;
    } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();
        input.close();
        System.out.println("The string in binary is");
        stringToBinary(s);
        System.out.println();
        System.out.println("The string converted to hexadecimal is");
        System.out.println(stringToHexadecimal(s));
        System.out.println("The Hexadecimal code converted to binary is");
        System.out.println(hexToBinary(stringToHexadecimal(s)));
    }
}
