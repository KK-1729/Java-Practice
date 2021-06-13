import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class question2 {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fout = new FileOutputStream("input.txt");
            OutputStreamWriter owrite = new OutputStreamWriter(fout);
            owrite.write(1729);
            owrite.close();
            fout.close();
            System.out.println("File write is successful");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
