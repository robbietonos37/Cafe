import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class MenuManager {

    ArrayList<MenuItem> menuItems = new ArrayList<>();

    private int numberOfMenuItems = 0;

    private Connection connection;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;

    public MenuManager() throws IOException, SQLException {
        Properties props = new Properties();
        props.load(new FileInputStream("config.properties"));
        dbUrl = props.getProperty("db.url");
        dbUsername = props.getProperty("db.username");
        dbPassword = props.getProperty("db.password");

        connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }

    public void addItemToMenu(MenuItem menuItem) throws SQLException {
        menuItems.add(menuItem);
        numberOfMenuItems++;

        Connection conn = null;
        Statement stmt = null;

        try {

            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

            String sql = "INSERT INTO menuItems (choiceName, caffeineContent, calorieContent, itemPrice) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, menuItem.getChoiceName());
            pstmt.setInt(2, menuItem.getCaffeineContent());
            pstmt.setInt(3, menuItem.getCalorieContent());
            pstmt.setDouble(4, menuItem.getItemPrice());
            int rowsAffected = pstmt.executeUpdate();




        } finally {
            if(conn != null){
                conn.close();
            }
        }
    }

    public void addItemToMenu(String itemName, double itemPrice, int calories, int caffeine, String Size){
        menuItems.add(new MenuItem(itemName, itemPrice, calories, caffeine, Size));
        numberOfMenuItems++;
    }

    public void removeMenuItem(MenuItem menuItem){
        menuItems.remove(menuItem);
        numberOfMenuItems--;
    }

    public int getNumberOfMenuItems(){
        return numberOfMenuItems;
    }

}
