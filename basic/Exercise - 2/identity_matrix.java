import java.util.Scanner;

public class identity_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows or columns of the matrix");
        int m = input.nextInt();
        int mat[][] = new int[m][m];
        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                mat[i][j] = input.nextInt();
            }
        }
        input.close();
        boolean identity_matrix = true;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                if(i == j && mat[i][j] != 1) {
                    identity_matrix = false;
                }
                if(i != j && mat[i][j] != 0) {
                    identity_matrix = false;
                }
            }
        }
        if(identity_matrix) {
            System.out.println("The matrix is an identity matrix");
        }
        else {
            System.out.println("The matrix is not an identity matrix");
        }
    }
}
