import java.util.ArrayList;

public class Cafe {

    private String cafeName;

    ArrayList<Customer> cafeCustomers= new ArrayList<>();

    ArrayList<MenuItem> menuItems = new ArrayList<>();

    ArrayList<MenuItem> customerOrder = new ArrayList<>();
    private int customerCount = 0;
    Cafe(){
        cafeName = "";
    }

    Cafe(String name){
        cafeName = name;
    }

    public void addCustomer(String firstName, String lastName, String phoneNumber){
        cafeCustomers.add(new Customer(firstName, lastName, phoneNumber));
        customerCount++;
    }
    public String getCafeName(){
        return cafeName;
    }
    public Customer getCustomer(int i){
        return cafeCustomers.get(i);
    }

    public void addMenuItem(String itemName, double itemPrice, int calories, int caffeine){
        menuItems.add(new MenuItem(itemName, itemPrice, calories, caffeine));
    }
}
