import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator_operations {
    public static void main(String[] args) throws Throwable {
        try {
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter name");
            String n = input.nextLine();
            System.out.println("Enter number 1");
            int a = input2.nextInt();
            System.out.println("Enter number 2");
            int b = input2.nextInt();
            calculator c = new calculator(n, a, b);
            c.add();
            c.display_namelength();
            c.divide();
            input.close();
            input2.close();
        }
        catch(ArithmeticException a) {
            System.out.println(a.getMessage());
        }
        catch(InputMismatchException i) {
            System.out.println(i.getMessage());
        }
    }
}

class calculator {
    String name;
    int num1;
    int num2;
    public calculator(String name, int num1, int num2) {
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() {
        System.out.println(num1 + num2);
    }

    public void divide() {
        System.out.println(num1 / num2);
    }

    public void display_namelength() {
        System.out.println(name.length());
    }
}