import java.io.IOException;
import java.util.Scanner;
import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class Driver {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        Cafe robs = new Cafe();
        robs.customerManager.addCustomer("Doodle", "Bob", "1010101010", "bikinibottom@gmail");


        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database
            //String url = "jdbc:mysql://localhost:3306/coffeeCustomers";
            //String user = "root";
            //String password = "Edgework37!";
            conn = DriverManager.getConnection(robs.customerManager.getDbUrl(), robs.customerManager.getDbUsername(),
                    robs.customerManager.getDbPassword());

            // Execute a SQL statement
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM customers");

            System.out.println("Customer table contents: ");
            // Process the result set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                System.out.println(id + "\t" + name + "\t" + email + "\t" + phone);
                // Do something with each row in the result set
            }
        } catch (SQLException ex) {
            // Handle any SQL exceptions that may occur
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            // Handle any errors that may occur when loading the JDBC driver
            ex.printStackTrace();
        } finally {
            // Close the result set, statement, and connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


    }

