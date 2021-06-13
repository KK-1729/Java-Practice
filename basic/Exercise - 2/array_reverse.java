public class array_reverse {
    public static void main(String[] args) {
        int arr[] = {32, 21, 90, 45, 6, 58};
        System.out.println("Actual array");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reversed array");
        for(int i = (arr.length) - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
