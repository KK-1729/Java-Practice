public class bubble_sort {
    public static void main(String[] args) {
        int arr[] = {32, 21, 90, 45, 6, 58};
        int n = arr.length;
        System.out.println("Array before bubble sort");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int temp = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n-i); j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array after bubble sort");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
