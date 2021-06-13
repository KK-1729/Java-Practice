import java.io.*;

public class prime_numbers {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread((Runnable) () -> {
            try {
                File f = new File("file 1.txt");
                FileOutputStream fout = new FileOutputStream(f);
                DataOutputStream dout = new DataOutputStream(fout);
                for(int i = 0; i <= 100; i++) {
                    boolean prime = true;
                    for(int j = 2; j <= i/2; j++) {
                        if(i%j == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if(prime) {
                        dout.writeInt(i);
                        Thread.sleep(2000);
                    }
                }
                dout.close();
                fout.close();
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t2 = new Thread((Runnable) () -> {
            try {
                File f = new File("file 2.txt");
                FileOutputStream fout = new FileOutputStream(f);
                DataOutputStream dout = new DataOutputStream(fout);
                for(int i = 101; i <= 200; i++) {
                    boolean prime = true;
                    for(int j = 2; j <= i/2; j++) {
                        if(i%j == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if(prime) {
                        dout.writeInt(i);
                        Thread.sleep(2000);
                    }
                }
                dout.close();
                fout.close();
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t3 = new Thread((Runnable) () -> {
            try {
                File f = new File("file 1.txt");
                FileInputStream fin = new FileInputStream(f);
                DataInputStream din = new DataInputStream(fin);
                while(din.available() > 0) {
                    System.out.println("Printing from file 1.txt - " + din.readInt());
                }
                din.close();
                fin.close();
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t4 = new Thread((Runnable) () -> {
            try {
                File f = new File("file 2.txt");
                FileInputStream fin = new FileInputStream(f);
                DataInputStream din = new DataInputStream(fin);
                while(din.available() > 0) {
                    System.out.println("Printing from file 2.txt - " + din.readInt());
                }
                din.close();
                fin.close();
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();
        t4.start();
    }
}
