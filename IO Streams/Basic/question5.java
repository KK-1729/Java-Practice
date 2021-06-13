import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable {
    public String name;
    public String reg_no;
    public student(String a, String b) {
        super();
        name = a;
        reg_no = b;
    }
}

public class question5 {
    public static void main(String[] args) throws IOException{
        try {
            student s = new student("Karthik", "19BIT0168");
            File f = new File("new_file3");
            ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(f));
            oout.writeObject(s);
            oout.close();
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(f));
            student s1 = null;
            s1 = (student)oin.readObject();
            System.out.println("Name - " + s1.name);
            System.out.println("Reg No - " + s1.reg_no);
            oin.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
