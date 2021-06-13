import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class question4 {
    public static void main(String[] args) throws IOException {
        try {
            File f = new File("new_file2.txt");
            BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(f));
            bout.write(121);
            bout.close();
            FileInputStream fin = new FileInputStream(f);
            BufferedInputStream bin = new BufferedInputStream(fin);
            int n = bin.read();
            System.out.println((char)n);
            fin.close();
            bin.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
