import java.util.ArrayList;

public class MenuManager {

    ArrayList<MenuItem> menuItems = new ArrayList<>();

    private int numberOfMenuItems = 0;

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
