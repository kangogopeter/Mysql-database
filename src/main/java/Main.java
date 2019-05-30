package javaapplication6;
import java.sql.*;

public class JavaApplication6 {

    private static final String url = "jdbc:mysql://localhost/the app-name";
    private static final String user = "root";
    private static final String password = "";

    public static void main(String[] args) {
        System.out.println("Hello world!!");
        Statement stmt = null;
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Success");
            stmt = con.createStatement();
            String sql = "INSERT INTO party " + "VALUES (1, 'joe')";
            stmt.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}