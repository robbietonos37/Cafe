import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class MenuManager {

    ArrayList<MenuItem> menuItems = new ArrayList<>();

    private int numberOfMenuItems = 0;

    private Connection connection;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;

    Random random = new Random();

    public MenuManager() throws IOException, SQLException {
        Properties props = new Properties();
        props.load(new FileInputStream("config.properties"));
        dbUrl = props.getProperty("db.url2");
        dbUsername = props.getProperty("db.username");
        dbPassword = props.getProperty("db.password");

        connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }

    public void addItemToMenu(MenuItem menuItem) throws SQLException {
        menuItems.add(menuItem);
        numberOfMenuItems++;

        Connection conn = null;
        Statement stmt = null;
        int randId = random.nextInt(99999998) + 1;

        try {

            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

            String sql = "INSERT INTO menuItems (id, choiceName, caffeineContent, calorieContent, itemPrice) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, randId);
            pstmt.setString(2, menuItem.getChoiceName());
            pstmt.setInt(3, menuItem.getCaffeineContent());
            pstmt.setInt(4, menuItem.getCalorieContent());
            pstmt.setDouble(5, menuItem.getItemPrice());
            int rowsAffected = pstmt.executeUpdate();




        } finally {
            if(conn != null){
                conn.close();
            }
        }
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
