import java.util.Scanner;
import java.io.*;

public class reading_words {
    public static void main(String[] args) throws Exception {
        try {
            Thread thread1 = new Thread((Runnable) () -> {
                try {
                    Scanner input = new Scanner(new File("sample1.txt"));
                    int a[] = {0, 0, 0};
                    while(input.hasNext()) {
                        String word = input.next();
                        if(word.compareTo("a") == 0) {
                            a[0] += 1;
                        }
                        else if(word.compareTo("and") == 0) {
                            a[1] += 1;
                        }
                        else if(word.compareTo("the") == 0) {
                            a[2] += 1;
                        }
                    }
                    System.out.println("a occurs " + a[0] + " times");
                    System.out.println("and occurs " + a[1] + " times");
                    System.out.println("the occurs " + a[2] + " times");
                    input.close();
                }
                catch(FileNotFoundException f) {
                    System.out.println(f.getMessage());
                }
            });

            Thread thread2 = new Thread((Runnable) () -> {
                try {
                    Scanner input = new Scanner(new File("sample2.txt"));
                    int count = 0;
                    while(input.hasNext()) {
                        String word = input.next();
                        if(word.compareTo("a") != 0 && word.compareTo("and") != 0 && word.compareTo("the") != 0 && word.startsWith("S")) {
                            count += 1;
                        }
                    }
                    System.out.println("The number of times the word that start with S is " + count);
                }
                catch(FileNotFoundException f) {
                    System.out.println(f.getMessage());
                }
            });

            Thread thread3 = new Thread((Runnable) () -> {
                System.out.println("Thanks for using our software");
            });

            thread1.start();
            thread1.setPriority(2);
            thread2.start();
            thread2.setPriority(2);
            thread1.join();
            thread2.join();
            thread3.start();
            thread3.setPriority(1);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
