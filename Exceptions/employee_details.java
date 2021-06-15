import java.util.Scanner;

public class employee_details {
    public static void main(String[] args) {
        employee e[] = new employee[2];
        e[0] = new employee();
        e[1] = new employee();
        try {
            for(employee each:e) {
                if(each.yearsOfExperience > 20 || each.yearsOfExperience < 5) {
                    throw new experienceCheck("Experience does not match");
                }
                if(each.salary > 500000 || each.salary < 5000) {
                    throw new salaryCheck("Salary does not fall within the range");
                }
                if(each.age > 60 || each.age < 25) {
                    throw new ageCheck("Age not in the range");
                }
            }
        }
        catch(experienceCheck ec) {
            System.out.println(ec.message);
        }
        catch(salaryCheck sc) {
            System.out.println(sc.message);
        }
        catch(ageCheck ac) {
            System.out.println(ac.message);
        }
        finally {
            System.out.println("Thanks for using our software");
        }
    }
}

class employee {
    String empid;
    String name;
    int age;
    String designation;
    int yearsOfExperience;
    String department;
    int salary;
    public employee() {
        System.out.println("Enter employee details");
        Scanner input = new Scanner(System.in);
        this.empid = input.nextLine();
        this.name = input.nextLine();
        this.age = input.nextInt();
        this.designation = input.nextLine();
        this.yearsOfExperience = input.nextInt();
        this.department = input.nextLine();
        this.salary = input.nextInt();
    }
}

class experienceCheck extends Exception {
    String message;
    public experienceCheck(String s) {
        super(s);
        this.message = s;
    }
}

class salaryCheck extends Exception {
    String message;
    public salaryCheck(String s) {
        super(s);
        this.message = s;
    }
}

class ageCheck extends Exception {
    String message;
    public ageCheck(String s) {
        super(s);
        this.message = s;
    }
}


