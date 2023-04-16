import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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

    public void addItemToMenu(MenuItem menuItem){
        menuItems.add(menuItem);
        numberOfMenuItems++;
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
