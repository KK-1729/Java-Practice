import java.util.Iterator;
import java.util.LinkedList;

public class car_data_manipulation {
    public static void main(String[] args) {
        car c1 = new car("KK473", "Benz S-Class", "Mercedes");
        car c2 = new car("XYZ978", "Ecosport", "Ford");
        car c3 = new car("PQ6174", "Endeavor", "Ford");
        LinkedList<car> car_list = new LinkedList<>();
        car_list.add(c1);
        car_list.add(c2);
        car_list.add(c3);
        Iterator<car> loop = car_list.iterator();
        while(loop.hasNext()) {
            car req = (car)loop.next();
            if(req.car_brand.equals("Ford")) {
                System.out.println(req.card_id + " - " + req.car_name + " - " + req.car_brand);
            } 
        }
    }
}

class car {
    public String card_id;
    public String car_name;
    public String car_brand;
    public car(String a, String b, String c) {
        this.card_id = a;
        this.car_name = b;
        this.car_brand = c;
    }
}