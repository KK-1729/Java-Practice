public class bonus {
    String name;
    long phone;
    int exp;
    public bonus(String s, long l, int n) {
        name = s;
        phone = l;
        exp = n;
    }
    public void bonus_calc() {
        if(exp > 3) {
            int amount = 500*(exp-3);
            System.out.println("The bonus amount is: " + amount);
            System.out.println("The phone number of the employee is: " + phone);
        }
        else {
            System.out.println("Not eligible for bonus");
        }
    }
    public static void main(String[] args) {
        bonus a = new bonus("Kumar", 9012345621L, 17);
        bonus b = new bonus("Dinesh", 8143567890L, 7);
        bonus c = new bonus("Ganesh", 7114567213L, 13);
        bonus d = new bonus("Rajesh", 9098456743L, 2);
        bonus e = new bonus("Rakesh", 8159056784L, 9);
        a.bonus_calc();
        b.bonus_calc();
        c.bonus_calc();
        d.bonus_calc();
        e.bonus_calc();
    }   
}
