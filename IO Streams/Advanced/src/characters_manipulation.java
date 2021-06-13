import java.io.*;
import java.util.Scanner;

public class characters_manipulation {
    public static void main(String[] args) throws Exception {
        try {
            File f = new File("sample.txt");
            while(true) {
                Scanner input = new Scanner(System.in);
                Scanner input2 = new Scanner(System.in);
                System.out.println("Enter your choice");
                System.out.println("1 - Write UTF-16 characters to a file");
                System.out.println("2 - Read UTF-16 characters from a file");
                System.out.println("3 - Exit");
                System.out.println("Enter choice - ");
                int choice = input.nextInt();
                if(choice == 1) {
                    FileOutputStream fout = new FileOutputStream(f);
                    OutputStreamWriter ow = new OutputStreamWriter(fout, "UTF-16");
                    System.out.println("Enter string to be written ");
                    String str = input2.nextLine();
                    ow.write(str);
                    ow.close();
                    fout.close();
                }
                else if(choice == 2) {
                    FileInputStream fin = new FileInputStream(f);
                    InputStreamReader ir = new InputStreamReader(fin, "UTF-16");
                    char c[] = new char[100];
                    ir.read(c);
                    for(char each: c) {
                        System.out.print(each);
                    }
                    System.out.println();
                    ir.close();
                    fin.close();
                }
                else if(choice == 3) {
                    input.close();
                    input2.close();
                    System.exit(1);
                }
                else {
                    System.out.println("Invalid choice!!");
                }
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
