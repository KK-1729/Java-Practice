import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class customer_data_manipulation {
    public static void main(String[] args) {
        LinkedList<customer> c = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter customer " + (i+1) + " details");
            System.out.println("Enter customer id");
            String cid = input.nextLine();
            System.out.println("Enter customer name");
            String cname = input.nextLine();
            c.add(new customer(cid, cname));
        }
        input.close();
        System.out.println("Customer details");
        Iterator<customer> loop = c.descendingIterator();
        while(loop.hasNext()) {
            customer temp = loop.next();
            System.out.println(temp.id + " - " + temp.name);
        }
    }
}

class customer {
    public String id;
    public String name;
    public customer(String a, String b) {
        this.id = a;
        this.name = b;
    }
}