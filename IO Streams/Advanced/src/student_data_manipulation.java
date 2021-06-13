import java.io.*;
import java.util.Scanner;

public class student_data_manipulation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            Scanner input = new Scanner(System.in);
            student s[] = new student[3];
            File f = new File("student_data.txt");
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            for(int i = 0; i < 3; i++) {
                System.out.println("Enter details of student " + (i+1));
                String n = input.nextLine();
                String r = input.nextLine();
                String e = input.nextLine();
                String a = input.nextLine();
                s[i] = new student(n, r, e, a);
                oout.writeObject(s[i]);
            }
            oout.close();
            fout.close();
            input.close();

            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream oin = new ObjectInputStream(fin);
            student st[] = new student[3];
            for(int i = 0 ; i < 3; i++) {
                st[i] = (student) oin.readObject();
            }
            oin.close();
            fin.close();
            boolean flag = false;
            for(student each: st) {
                if(each.regno.substring(2, 5).compareTo("BCE") == 0 && each.address.toLowerCase().contains("vellore")) {
                    flag = true;
                    each.display();
                }
            }
            if(flag == false) {
                System.out.println("No Such Students Match the Criteria");
            }
        }
        catch(IOException i) {
            System.out.println(i.getMessage());
        }
        catch(ClassNotFoundException c) {
            System.out.println(c.getMessage());
        }
    }
}

class student implements Serializable {
    public String name;
    public String regno;
    public String emailId;
    public String address;

    public student(String a, String b, String c, String d) {
        this.name = a;
        this.regno = b;
        this.emailId = c;
        this.address = d;
    }

    public void display() {
        System.out.println(name + " - " + regno + " - " + emailId + " - " + address);
    }
}