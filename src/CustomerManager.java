import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class CustomerManager {

    ArrayList<Customer> cafeCustomers= new ArrayList<>();

    private int totalNumberOfCustomers = 0;

    private Connection connection;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;

    public CustomerManager() throws IOException, SQLException {
        Properties props = new Properties();
        props.load(new FileInputStream("config.properties"));
         dbUrl = props.getProperty("db.url");
         dbUsername = props.getProperty("db.username");
         dbPassword = props.getProperty("db.password");

        connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void addCustomer(String firstName, String lastName, String phoneNumber, String email) throws SQLException {
        cafeCustomers.add(new Customer(firstName, lastName, phoneNumber, email));
        totalNumberOfCustomers++;

        Connection conn = null;
        Statement stmt = null;

        try {

            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

            String sql = "INSERT INTO customers (name, email, phone) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, firstName + " " + lastName);
            pstmt.setString(2, email);
            pstmt.setString(3, phoneNumber);
            int rowsAffected = pstmt.executeUpdate();


        } finally {
            if(conn != null){
                conn.close();
            }
        }
    }


        public void addCustomer(Customer customer){
        cafeCustomers.add(customer);
        totalNumberOfCustomers++;
    }



    public void removeCustomer(Customer customer){
        if(!cafeCustomers.contains(customer)){
            System.out.println("Customer does not exist");
        }
        else{
            cafeCustomers.remove(customer);
        }
    }

    public Customer getCustomer(int i){
        return cafeCustomers.get(i);
    }

    public void addToCustomerFavorites(Customer customer, MenuItem menuItem){
        if(!cafeCustomers.contains(customer)){
            System.out.println("Customer does not exist");
            return;
        }
        cafeCustomers.get(cafeCustomers.indexOf(customer)).addToFavorites(menuItem);
    }

    public void addToCustomerOrder(Customer customer, MenuItem menuItem){
        if(!cafeCustomers.contains(customer)){
            System.out.println("Customer does not exist");
        }
        cafeCustomers.get(cafeCustomers.indexOf(customer)).addToOrder(menuItem);
    }

    public void removeLastItemFromOrder(Customer customer){
        if(!cafeCustomers.contains(customer)){
            System.out.println("Customer does not exist");
        }
        cafeCustomers.get(cafeCustomers.indexOf(customer)).removeLastItemFromOrder();
    }

    public void removeThisItemFromOrder(Customer customer,MenuItem menuItem){
        int customerIndex = cafeCustomers.indexOf(customer);
        if(!cafeCustomers.contains(customer)){
            System.out.println("Customer does not exist");
        }
        if(!cafeCustomers.get(customerIndex).customerOrder.contains(menuItem)){
            System.out.println("Item not in order");
        }
    }

    public int getTotalNumberOfCustomers(){
        return totalNumberOfCustomers;
    }
}
