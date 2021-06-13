import java.sql.*;
import java.util.Scanner;

public class dd_connection {
    public static void main(String[] args) throws Exception {
        try {
            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik", "root", "");
            System.out.println("Database connection established");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your registration number");
            String regno = input.nextLine();
            System.out.println("Enter your name");
            String name = input.nextLine();
            System.out.println("Enter your password");
            String password = input.nextLine();
            System.out.println("Enter your country");
            String country = input.nextLine();
            System.out.println("Enter your marks");
            int marks = input.nextInt();
            input.close();
            String sql = "INSERT INTO student VALUES(?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, regno);
            stmt.setString(2, name);
            stmt.setString(3, password);
            stmt.setString(4, country);
            stmt.setInt(5, marks);
            stmt.execute();
            stmt.close();
            con.close();
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
