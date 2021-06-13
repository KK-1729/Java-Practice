import java.io.*;
import java.util.Scanner;

public class faculty_data_maipulation {
    public static void main(String[] args) throws Exception {
        file_operation fop = new file_operation();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    fop.write_objects();
                }
                catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    fop.read_objects();
                }
                catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

}

class faculty implements Serializable {
    public String faculty_id;
    public String faculty_name;
    public String faculty_designation;
    public String faculty_gender;
    public faculty(String a, String b, String c, String d) {
        this.faculty_id = a;
        this.faculty_name = b;
        this.faculty_designation = c;
        this.faculty_gender = d;
    }

    public faculty() {
        this.faculty_id = "";
        this.faculty_name = "";
        this.faculty_designation = "";
        this.faculty_gender = "";
    }

    public void display() {
        System.out.println(faculty_id + " - " + faculty_name + " - " + faculty_designation + " - " + faculty_gender);
    }

    public static void sort_faculty(faculty f[]) {
        for(int i = 0; i < f.length; i++) {
            for(int j = 0; j < (f.length-(i+1)); j++) {
                if(f[j].faculty_name.compareTo(f[j+1].faculty_name) > 0) {
                    faculty temp = new faculty();
                    temp = f[j];
                    f[j] = f[j+1];
                    f[j+1] = temp;
                }
            }
        }
        System.out.println("The sorted faculty names list is");
        for(faculty each: f) {
            System.out.println(each.faculty_name);
        }
    }
}

class file_operation {
    private boolean file_busy = false;
    public synchronized void write_objects() throws Exception {
        try {
            this.file_busy = true;
            Scanner input = new Scanner(System.in);
            File f = new File("faculty.txt");
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            faculty a[] = new faculty[5];
            for(int i = 0; i < 5; i++) {
                System.out.println("Enter details for faculty " + (i+1));
                System.out.println("Enter faculty id");
                String fi = input.nextLine();
                System.out.println("Enter faculty name");
                String fn = input.nextLine();
                System.out.println("Enter faculty designation");
                String fd = input.nextLine();
                System.out.println("Enter faculty gender");
                String fg = input.nextLine();
                a[i] = new faculty(fi, fn, fd, fg);
                oout.writeObject(a[i]);
            }
            this.file_busy = false;
            notifyAll();
            oout.close();
            fout.close();
            input.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public synchronized void read_objects() throws Exception {
        try {
            faculty b[] = new faculty[5];
            while(this.file_busy == true) {
                System.out.println("Waiting to read file faculty.txt");
                wait();
            }
            System.out.println("Finished waiting to read");
            File f = new File("faculty.txt");
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream oin = new ObjectInputStream(fin);
            for(int i = 0; i < 5; i++) {
                b[i] = (faculty) oin.readObject();
                if(b[i].faculty_designation.compareTo("Assistant Professor") == 0) {
                    b[i].display();
                }
            }
            faculty.sort_faculty(b);
            oin.close();
            fin.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
