import java.util.ArrayList;

public class MenuManager {

    ArrayList<MenuItem> menuItems;

    private int numberOfMenuItems = 0;

    public MenuManager(){
        ArrayList<MenuItem> menuItems = new ArrayList<>();
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

}
