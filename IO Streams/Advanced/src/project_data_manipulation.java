import java.io.*;
import java.util.Scanner;

public class project_data_manipulation {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            while(true) {
                System.out.println("Choose Option");
                System.out.println("1 - Submit project data");
                System.out.println("2 - View project data");
                System.out.println("3 - Exit");
                System.out.println("Enter choice -  ");
                int choice = input.nextInt();
                if(choice == 1) {
                    System.out.println("Enter project details");
                    System.out.println("Enter project name");
                    String pn = input2.nextLine();
                    System.out.println("Enter project ID");
                    String pid = input2.nextLine();
                    System.out.println("Enter budget");
                    int b = input.nextInt();
                    System.out.println("Enter location");
                    String l = input2.nextLine();
                    Project p = new Project(pn, pid, b, l);
                    File f = new File("project.txt");
                    FileOutputStream fout = new FileOutputStream(f);
                    ObjectOutputStream oout = new ObjectOutputStream(fout);
                    oout.writeObject(p);
                    oout.close();
                    fout.close();
                }
                else if(choice == 2) {
                    File f = new File("project.txt");
                    FileInputStream fin = new FileInputStream(f);
                    ObjectInputStream oin = new ObjectInputStream(fin);
                    Project arr[] = new Project[Project.count];
                    for(int i = 0;  i < Project.count; i++) {
                        arr[i] = (Project) oin.readObject();
                        arr[i].display();
                    }
                    oin.close();
                }
                else if(choice == 3) {
                    input.close();
                    input2.close();
                    System.exit(1);
                }
                else {
                    System.out.println("Invalid choice!!!");
                }
            }
        }
        catch(FileNotFoundException f) {
            System.out.println(f.getMessage());
        }
        catch(IOException i) {
            System.out.println(i.getMessage());
        }
        catch(ClassNotFoundException c) {
            System.out.println(c.getMessage());
        }
    }
}

class Project implements Serializable {
    public String projectName;
    public String projectID;
    public int budget;
    public String location;
    public static int count = 0;

    public Project(String a, String b, int c, String d) {
        this.projectName = a;
        this.projectID = b;
        this.budget = c;
        this.location = d;
        count += 1;
    }

    public void display() {
        System.out.println(projectName + " - " + projectID + " - " + budget + " - " + location);
    }
}