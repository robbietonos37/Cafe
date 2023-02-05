import java.util.ArrayList;

public class Cafe {

    private String cafeName;
    ArrayList<Customer> cafeCustomers= new ArrayList<>();
    ArrayList<MenuItem> menuItems = new ArrayList<>();

    MenuManager menuManager = new MenuManager();
    private int numberOfMenuItems = 0;
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
    public void addCustomer(Customer customer){
        cafeCustomers.add(customer);
        customerCount++;
    }
    public void setCafeName(String cafeName){
        this.cafeName = cafeName;
    }

    public String getCafeName(){
        return cafeName;
    }

    public Customer getCustomer(int i){
        return cafeCustomers.get(i);
    }

    public void addToCustomerFavorites(Customer customer, MenuItem menuItem){
        customer.addToFavorites(menuItem);
    }

}
