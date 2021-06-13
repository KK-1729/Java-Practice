import java.util.Scanner;

public class linear_search {
    public static int linearSearch(int arr[], int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = input.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int k = input.nextInt();
        input.close();
        System.out.println(k + " is found at index: " + linearSearch(a, k));
    }
}
