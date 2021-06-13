import java.io.*;

public class question1 {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fin = new FileInputStream("input.txt");
            InputStreamReader iread = new InputStreamReader(fin, "UTF-16");
            int data = iread.read();
            System.out.println((char)data); 
            iread.close();
            fin.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}