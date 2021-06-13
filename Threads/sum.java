import java.io.*;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) throws Throwable {
        int sum1[] = {0};
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    File f = new File("file1.txt");
                    Scanner input = new Scanner(f);
                    String word;
                    while(input.hasNext()) {
                        word = input.next();
                        if(word.contains("7") || word.contains("9")) {
                            sum1[0] += Integer.parseInt(word);
                        }
                    }
                    System.out.println("Sum of numbers containing 7 or 9 is: " + sum1[0]);
                    input.close();
                }
                catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        int sum2[] = {0};
        int a[] = {0};
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    File f = new File("file2.txt");
                    Scanner input = new Scanner(f);
                    String word;
                    while(input.hasNext()) {
                        word = input.next();
                        a[0] = Integer.parseInt(word); 
                        if(a[0] % 9 == 0 || a[0] % 11 == 0) {
                            sum2[0] += (a[0]*a[0]);
                        }
                        a[0] = 0;
                    }
                    System.out.println("Sum of squares of numbers divisible by 9 or 11 is " + sum2[0]);
                    input.close();
                }
                catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }); 

        int sum3[] = {0};
        int b[] = {0};
        Thread t3 = new Thread(new Runnable() {
            public void run() {
                try {
                    File f = new File("file3.txt");
                    Scanner input = new Scanner(f);
                    String word;
                    while(input.hasNext()) {
                        word = input.next();
                        b[0] = Integer.parseInt(word);
                        if(word.length() == 4 && word.charAt(word.length()-1) == '8') {
                            sum3[0] += b[0];
                        }
                        b[0] = 0;
                    }
                    System.out.println("Sum of 4 digit numbers that end with 8 is " + sum3[0]);
                    input.close();
                }
                catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        int sum4[] = {0};
        Thread t4 = new Thread(new Runnable() {
            public void run() {
                try {
                    File f = new File("file4.txt");
                    Scanner input = new Scanner(f);
                    String word;
                    while(input.hasNext()) {
                        word = input.next();
                        sum4[0] += Integer.parseInt(word);
                    }
                    input.close();
                }
                catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        System.out.println("Sum of all sums is " + (sum1[0]+sum2[0]+sum3[0]+sum4[0]));
    }
}
