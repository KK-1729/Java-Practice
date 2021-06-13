import java.util.Scanner;

public class matrix_transpose {
    public static void transposeOfMatrix(int mat[][]) {
        int r = mat.length;
        int c = mat[0].length;
        int mat_t[][] = new int[c][r];
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                mat_t[i][j] = mat[j][i];
            }
        }
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                System.out.print(mat_t[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns of the matrix");
        int columns = input.nextInt();
        System.out.println("Enter the elements of the matrix");
        int a[][] = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                a[i][j] = input.nextInt();
            }
        }
        input.close();
        System.out.println("The transpose of the matrix is");
        transposeOfMatrix(a);
    }
}
