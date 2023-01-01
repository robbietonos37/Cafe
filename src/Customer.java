import java.util.Random;

public class Customer {


    private String phoneNumber;
    private String firstName;
    private String lastName;
    private int points;
    private double totalLifetimeSpend;
    private int customerId;

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
        this.phoneNumber = phoneNumber;
    }

    public void updateLifeTimeSpend(double orderTotal){
        totalLifetimeSpend += orderTotal;
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

    public void buyCoffee(double orderAmount){
        totalLifetimeSpend += orderAmount;
    }

    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\nCustomer ID: " + customerId + "\nPhone Number: " + phoneNumber + "\nTotal Lifetime Spend: "
                + totalLifetimeSpend + "\nTotal Points: " + points;
    }

}
