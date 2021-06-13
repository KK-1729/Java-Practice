class product_configuration {
    public String product_id;
    public String product_name;
    public int serial_number;
    public String company;
    public String manufacture_date;
    public int price;

    public product_configuration(String id, String name, int no, String com, String date, int p) {
        product_id = id;
        product_name = name;
        serial_number = no;
        company = com;
        manufacture_date = date;
        price = p;
    }
}
public class products {
    public static void display_all_products(product_configuration a[], String str) {
        System.out.println("All products that are manufactured by " + str);
        for(int i = 0; i < a.length; i++) {
            if((a[i].company).equals(str)) {
                System.out.println(a[i].product_id + " - " + a[i].product_name);
            }
        }
    }

    public static void display_year_products(product_configuration a[], String m, String n) {
        System.out.println("The products manufactured between the years " + m + " and " + n);
        for(int i = 0; i < a.length; i++) {
            int l = (a[i].manufacture_date).length();
            if(((a[i].manufacture_date).substring(l-4)).compareTo(m)>=0 && ((a[i].manufacture_date).substring(l-4)).compareTo(n)<0) {
                System.out.println(a[i].product_id + " - " + a[i].product_name);
            }
        }
    }

    public static void display_price(product_configuration a[], int n) {
        System.out.println("The products whose price is greater than " + n);
        for(int i = 0; i < a.length; i++) {
            if(a[i].price > 10000) {
                System.out.println(a[i].product_name + " - " + a[i].price);
            }
        }
    }

    public static void display_name(product_configuration a[], String str) {
        System.out.println("The products that have " + str + " in their name");
        for(int i = 0; i < a.length; i++) {
            if((a[i].product_name).contains(str)) {
                System.out.println(a[i].product_id + " - " + a[i].product_name);
            }
        }
    }

    public static void main(String[] args) {
        product_configuration arr[] = new product_configuration[5];
        arr[0] = new product_configuration("A1074", "Redmi Note 9 Pro", 75, "Xiaomi", "15Jul2017", 18000);
        arr[1] = new product_configuration("B7621", "14.1 inch i7 Laptop", 104, "Dell", "5Dec2018", 57000);
        arr[2] = new product_configuration("C0098", "Galaxy M01", 812, "Samsung", "17May2014", 8500);
        arr[3] = new product_configuration("D1432", "iPad Pro", 8754, "Apple", "31Mar2016", 71000);
        arr[4] = new product_configuration("E1089", "Galaxy Tab A7", 182, "Samsung", "20Aug2020", 22000);

        display_all_products(arr, "Samsung");
        display_year_products(arr, "2012", "2019");
        display_price(arr, 10000);
        display_name(arr, "Laptop");
    }
}
