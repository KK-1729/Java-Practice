import java.io.*;
import java.util.Scanner;

public class arithmetic_data_operations {
    public static void main(String[] args) throws Exception {
        arithmetic_operations ao = new arithmetic_operations();
        Thread thr_read1 = new Thread(new Runnable() {
            public void run() {
                try {
                    ao.add();
                }
                catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thr_read2 = new Thread(new Runnable() {
            public void run() {
                try {
                    ao.multiply();
                }
                 catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thr_write = new Thread(new Runnable() {
            public void run() {
                try {
                    ao.write_to_file();
                }
                catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        });

        thr_read1.start();
        thr_read2.start();
        thr_write.start();
        thr_read1.join();
        thr_read2.join();
        thr_write.join();
    }
}

class arithmetic_operations {
    private boolean file_busy = false;
    public synchronized void write_to_file() throws Throwable {
            file_busy = true;
            Scanner input = new Scanner(System.in);
            File f = new File("input.txt");
            FileOutputStream fout = new FileOutputStream(f);
            DataOutputStream dout = new DataOutputStream(fout);
            System.out.println("Enter first number");
            int a = input.nextInt();
            System.out.println("Enter second number");
            int b = input.nextInt();
            dout.writeInt(a);
            dout.writeInt(b);
            System.out.println("Numbers have been written to input.txt");
            dout.close();
            fout.close();
            input.close();
            file_busy = false;
            notifyAll();
    }

    public synchronized void add() throws Throwable {
            File f = new File("input.txt");
            FileInputStream fin = new FileInputStream(f);
            DataInputStream din = new DataInputStream(fin);
            while(file_busy == true) {
                System.out.println("Thread add is waiting");
                wait();
            }
            int a = din.readInt();
            int b = din.readInt();
            System.out.println("Sum - " + (a+b));
            din.close();
            fin.close();
    }

    public synchronized void multiply() throws Throwable {
            File f = new File("input.txt");
            FileInputStream fin = new FileInputStream(f);
            DataInputStream din = new DataInputStream(fin);
            while(file_busy == true) {
                System.out.println("Thread multiply is waiting");
                wait();
            }
            int a = din.readInt();
            int b = din.readInt();
            System.out.println("Product - " + (a*b));
            din.close();
            fin.close();
    }
}
