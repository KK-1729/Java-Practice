import java.util.Scanner;

public class university {
    public static void main(String[] args) {
        dependent dep[] = new dependent[4];
        dep[0] = new professor();
        dep[0].calcSalary();
        dep[1] = new associate_professor();
        dep[1].calcSalary();
        dep[2] = new assistant_professor();
        dep[2].calcSalary();
        dep[3] = new tra();
        dep[3].calcSalary();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the id of the faculty you want to search");
        String search_id = input.nextLine();
        dependent.search(dep, search_id);
        input.close();
    }
}

abstract class dependent {
    String id;
    String name;
    String phone;
    String dob;
    double salary;
    public void get() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details");
        id = input.nextLine();
        name = input.nextLine();
        phone = input.nextLine();
        dob = input.nextLine();
    }
    public void display() {
        System.out.println(id + " - " + name + " - " + phone + " - " + dob + " - " + salary);
    }
    public static void search(dependent d[], String str) {
        for(int i = 0; i < d.length; i++) {
            if(d[i].id.equals(str)) {
                d[i].display();
            }
        }
    }
    public abstract void calcSalary();
}

class professor extends dependent {
    @Override
    public void calcSalary() {
        super.get();
        salary = 150000 + (0.3*150000);
        super.display();
    }
}

class associate_professor extends dependent {
    @Override
    public void calcSalary() {
        super.get();
        salary = 120000 + (0.2*120000);
        super.display();
    }
}

class assistant_professor extends dependent {
    @Override
    public void calcSalary() {
        super.get();
        salary = 100000 + (0.1*100000);
        super.display();
    }
}

class tra extends dependent {
    @Override
    public void calcSalary() {
        super.get();
        salary = 20000;
        super.display();
    }
}