public class array_index {
    public static void main(String[] args) throws Exception {
        try {
            int a[] = {8, 9, 10};
            for(int i = 0; i < 10; i++) {
                System.out.println(a[i]);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
