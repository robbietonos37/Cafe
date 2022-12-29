import java.util.Random;

public class Customer {


    private int phoneNumber;
    private String firstName;
    private String lastName;
    private int points;
    private double totalLifetimeSpend;
    private int customerId;

    Random random = new Random();

    Customer(String FirstName, String LastName, int PhoneNumber){
        firstName = FirstName;
        lastName = LastName;
        phoneNumber = PhoneNumber;
        customerId = random.nextInt(99999998) + 1;
        points = 0;
        totalLifetimeSpend = 0;
    }

    Customer(){
        firstName = "";
        lastName = "";
        phoneNumber = 0;
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

    public void setPhoneNumber(int phoneNumber){
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

    public int getPhoneNumber() {
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



}
