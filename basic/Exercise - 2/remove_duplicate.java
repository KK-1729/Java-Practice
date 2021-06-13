public class remove_duplicate {
    public static int removeDuplicateElements(int arr[], int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 15, 15, 15, 20, 25, 30, 30};
        int length = arr.length;
        System.out.println("Array before removing duplicate elements");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        length = removeDuplicateElements(arr, length);
        System.out.println("Array after removing duplicate elements");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
