import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Customer {

    private String phoneNumber;
    private String firstName;
    private String lastName;
    private int points;
    private double totalLifetimeSpend;
    private final int customerId;

    ArrayList<MenuItem> customerOrder = new ArrayList<>();

    ArrayList<MenuItem> customerFavorites = new ArrayList<>();

    Random random = new Random();

    Customer(String FirstName, String LastName, String PhoneNumber){
        firstName = FirstName;
        lastName = LastName;
        phoneNumber = PhoneNumber;
        customerId = random.nextInt(99999998) + 1;
        points = 0;
        totalLifetimeSpend = 0;
    }

    Customer(){
        customerId = random.nextInt(99999998) + 1;
        points = 0;
        totalLifetimeSpend = 0;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber.matches("\\d+")){
            this.phoneNumber = phoneNumber;
        }
        else {
            throw new IllegalArgumentException("Phone number must only contain numbers");
        }
    }

    public void updateLifeTimeSpend(double amountSpentToAdd){
        totalLifetimeSpend += amountSpentToAdd;
    }

    public void updatePoints(int orderPoints){
        points += orderPoints;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getTotalLifetimeSpend() {
        return totalLifetimeSpend;
    }

    public int getPoints() {
        return points;
    }

    public void addToOrder(MenuItem menuItem){
        customerOrder.add(menuItem);
    }

    public void addToFavorites(MenuItem menuItem){
        customerFavorites.add(menuItem);
    }

    public double getTotalCost(){
        double total = 0.0;
        for(MenuItem choice: this.customerOrder){
            total += choice.getItemPrice();
        }
        return total;
    }

    public void payForOrder(){
        this.totalLifetimeSpend += this.getTotalCost();
        this.points += Math.floor(this.getTotalCost());
        this.customerOrder.clear();
        //this will add total to customer lifetime spend and clear the current order.
    }

    public void removeLastItemFromOrder(){
        this.customerOrder.remove(this.customerOrder.size()-1);
    }

    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\nCustomer ID: " + customerId + "\nPhone Number: " + phoneNumber + "\nTotal Lifetime Spend: "
                + totalLifetimeSpend + "\nTotal Points: " + points;
    }

}
