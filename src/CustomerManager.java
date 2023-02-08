import java.util.ArrayList;

public class CustomerManager {

    ArrayList<Customer> cafeCustomers= new ArrayList<>();

    private int customerCount = 0;

    public void addCustomer(String firstName, String lastName, String phoneNumber){
        cafeCustomers.add(new Customer(firstName, lastName, phoneNumber));
        customerCount++;
    }

    public void addCustomer(Customer customer){
        cafeCustomers.add(customer);
        customerCount++;
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
}
