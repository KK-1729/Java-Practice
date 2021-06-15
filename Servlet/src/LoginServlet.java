import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }

    public void init(ServletConfig config) throws ServletException {

    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        String method = request.getMethod();
        if(method.equals("GET")) {
            doGet(request, response);
        }
        else if(method.equals("POST")) {
            doPost(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // checking params
        // if(username.equals("Karthik") && password.equals("Karthik123")) {
        //     out.println("Welcome Mr. " + username + " and your password is " + password);
        // }
        // else {
        //     out.println("I doubt u r an hacker");
        // }

        //using database for password validation
        try {
            student s = new student(username, password);
            boolean result = s.validateStudent();
            if(result) {
                out.println("Welcome " + username);
            }
            else {
                out.println("You are a hacker here");
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class student {
    private String username;
    private String password;

    public student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean validateStudent() {
        dbmsconnection connect = null;
        PreparedStatement stmt = null;
        Connection con = null;
        boolean found = false;
        try {
            connect = new dbmsconnection("jdbc:mysql://localhost:3306/karthik", "root", "");
            con = connect.getConnection();
            String sql = "SELECT * FROM student WHERE name = ? AND password = ?;";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if(rs.next() == false) {
                found = false;
            }
            else {
                found = true;
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            connect.closeConnection(con, stmt);
        }
        return found;
    }
}

class dbmsconnection {
    String url;
    String username;
    String password;

    public dbmsconnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public Connection getConnection() throws InstantiationException, IllegalAccessException, SQLException, ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public void closeConnection(Connection con, Statement stmt) throws SQLException {
        stmt.close();
        con.close();
        System.out.println("The connection is closed");
    }
}