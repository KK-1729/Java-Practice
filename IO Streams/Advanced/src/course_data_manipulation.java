import java.io.*;
import java.util.Scanner;

public class course_data_manipulation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            Scanner input = new Scanner(System.in);
            course c[] = new course[4];
            File f = new File("course.txt");
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            for(int i = 0; i < 4; i++) {
                System.out.println("Enter details of course " + (i+1));
                String ci = input.nextLine();
                String cn = input.nextLine();
                String co = input.nextLine();
                String cs = input.nextLine();
                c[i] = new course(ci, cn, co, cs);
                oout.writeObject(c[i]);
            }
            oout.close();
            fout.close();
            input.close();

            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream oin = new ObjectInputStream(fin);
            course c2[] = new course[4];
            for(int i = 0; i < 4; i++) {
                c2[i] = (course) oin.readObject();
            }
            oin.close();
            fin.close();
            boolean flag = false;
            for(course each: c2) {
                if(each.courseName.compareTo("Java Programming") == 0 && each.Course_slot.compareTo("C1") == 0 && each.courseOfferedBy.compareTo("SCOPE") == 0) {
                    flag = true;
                    each.display();
                }
            }
            if(flag == false) {
                System.out.println("No Such Courses Match the Criteria");
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

class course implements Serializable {
    public String courseID;
    public String courseName;
    public String courseOfferedBy;
    public String Course_slot;

    public course(String a, String b, String c, String d) {
        this.courseID = a;
        this.courseName = b;
        this.courseOfferedBy = c;
        this.Course_slot = d;
    }

    public void display() {
        System.out.println(courseID + " - " + courseName + " - " + courseOfferedBy + " - " + Course_slot);
    }
}