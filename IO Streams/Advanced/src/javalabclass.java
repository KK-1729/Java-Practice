import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class javalabclass {
    public static void main(String[] args) throws NullPointerException, IOException {
        try {
            shape s[] = new shape[4];
            s[0] = new shape();
            s[0].setShapeDetails();
            s[0].display_details();
            s[0].display_shapename();
            s[0].write_datatoFile();
        }
        catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class shape {
    int numsides;
    double area;
    String shapename;

    public void setShapeDetails() throws InputMismatchException {
        try {
            System.out.println("Enter the number of sides");
            Scanner input = new Scanner(System.in);
            this.numsides = input.nextInt();
            System.out.println("Enter the area");
            this.area = input.nextDouble();
        }
        catch(InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public void display_details() {
        System.out.println(numsides + area);
    }

    public void display_shapename() {
        if(this.shapename.equals("circle")) {
            System.out.println("its a circle");
        }
    }

    public void write_datatoFile() throws IOException, FileNotFoundException {
        try {
            File f = new File("satish.txt");
            FileOutputStream fout = new FileOutputStream(f);
            fout.write(numsides);
            fout.close();
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        } 
    }
}