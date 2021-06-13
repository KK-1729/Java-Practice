public class nullpointer {
    public static void main(String[] args) throws Exception {
        try {
            int x[] = null;
            System.out.println(x.length);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
