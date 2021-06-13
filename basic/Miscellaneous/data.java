import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        student arr[] = new student[3];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new student();
            arr[i].getInfo();
        }
        student.displayInfo(arr);
        student.sortObj(arr);
    }
}

class student {
    public String name;
    public String regno;
    public String phone;
    public void getInfo() {
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();
        this.regno = input.nextLine();
        this.phone = input.nextLine();
    }

    public static void displayInfo(student s[]) {
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i].name + " - " + s[i].regno + " - " + s[i].phone);
        }
        System.out.println();
    }

    public static void sortObj(student s[]) {
        for(int i = 0; i < s.length-1; i++) {
            for(int j = 0; j < s.length-1; j++) {
                if(s[j].name.compareTo(s[j+1].name) > 0) {
                    student t = new student();
                    t = s[j];
                    s[j] = s[j+1];
                    s[j+1] = t;
                }
            }
        }
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i].name + " - " + s[i].regno + " - " + s[i].phone);
        }
    }
}