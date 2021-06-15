<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*, java.io.*" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form method="post" action="login.jsp">
        <label for="selectname">Enter your name</label>
        <input type="text" name="username" required><br>
        <label for="selectpass">Enter your password</label>
        <input type="password" name="password" required><br>
        <label for="selectcountry">Select your country</label>
        <select>
            <option value="India" name="India">India</option>
            <option value="US" name="US">US</option>
            <option value="UK" name="UK">UK</option>
        </select>
        <br>
        <label for="selectmark">Enter your Mark</label>
        <input type="text" name="mark" required><br> 
        <input type="submit" name="submit" value="submit">
    </form>

    <%! 
        class student {
            private String username;
            private String password;
            private String country;
            private int mark;

            public student(String username, String password, String country, int mark) {
                this.username = username;
                this.password = password;
                this.country = country;
                this.mark = mark;
            }

            public boolean insertStudentRecord() {
                dbmsconnection connect = null;
                PreparedStatement stmt = null;
                Connection con = null;
                boolean insert = false;
                try {
                    connect = new dbmsconnection("jdbc:mysql://localhost:3306/karthik", "root", "");
                    con = connect.getConnection();
                    String sql = "INSERT INTO student VALUES(?, ?, ?, ?);";
                    stmt = con.prepareStatement(sql);
                    stmt.setString(1, username);
                    stmt.setString(2, password);
                    stmt.setString(3, country);
                    stmt.setString(4, mark);
                    int i = stmt.executeUpdate();
                    if(i > 0) {
                        insert = true;
                    }
                    else {
                        insert = false;
                    }
                }
                catch(Exception e) {
                    System.out.println(e.getMessage());
                }
                return insert;
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
    %>

    <% 
        String sub = request.getParameter("submit");
        if(sub != null) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String country = request.getParameter("country");
            String mark = request.getParameter("mark");
            try {
                student s = new student(username, password, country, Integer.parseInt(mark));
                boolean result = s.insertStudentRecord();
                if(result) {
                    out.print("Record Inserted Successfully");
                }
                else {
                    out.password("Learn JSP first!!");
                }
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    %>
</body>
</html>