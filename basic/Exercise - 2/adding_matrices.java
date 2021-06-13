import java.util.Scanner;

public class adding_matrices {
    public static void additionOfMatrices(int mat1[][], int mat2[][]) {
        int r1 = mat1.length;
        int c1 = mat1[0].length;
        int r2 = mat2.length;
        int c2 = mat2[0].length;
        if(r1 == r2 && c1 == c2) {
            int result[][] = new int[r1][c1];
            for(int i = 0; i < r1; i++) {
                for(int j = 0; j < c1; j++) {
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            System.out.println("The resultant matrix is");
            for(int i = 0; i < r1; i++) {
                for(int j = 0; j < c1; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Matrices cannot be added");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix");
        int r1 = input.nextInt();
        System.out.println("Enter the number of columns of the first matrix");
        int c1 = input.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter the elements of the first matrix");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the number of rows of second matrix");
        int r2 = input.nextInt();
        System.out.println("Enter the number of columns of the second matrix");
        int c2 = input.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter the elements of the second matrix");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                b[i][j] = input.nextInt();
            }
        }
        input.close();
        additionOfMatrices(a, b);
    }
}
