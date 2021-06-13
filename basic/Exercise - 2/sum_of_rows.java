import java.util.Scanner;

public class sum_of_rows {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows of the matrix");
        int m = input.nextInt();
        System.out.println("Enter number of columns of the matrix");
        int n = input.nextInt();
        int mat[][] = new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                mat[i][j] = input.nextInt();
            } 
        }
        input.close();
        int count;
        for(int i = 0; i < m; i++) {
            count = 0;
            for(int j = 0; j < n; j++) {
                count += mat[i][j];
            }
            System.out.println("Sum of " + (i+1) + " row: " + count);
        }
    }
}
