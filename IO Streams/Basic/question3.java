import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class question3 {
    public static void main(String[] args) throws IOException {
        try {
            File f = new File("new_file.txt");
            FileOutputStream fout = new FileOutputStream(f);
            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeInt(19);
            dout.writeUTF("Karthik");
            dout.writeBoolean(false);
            fout.close();
            dout.close();
            FileInputStream fin = new FileInputStream(f);
            DataInputStream din = new DataInputStream(fin);
            int n = din.readInt();
            String name = din.readUTF();
            boolean bool = din.readBoolean();
            System.out.println(name);
            System.out.println(n);
            System.out.println(bool);
            fin.close();
            din.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
