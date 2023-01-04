import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Big Rob's");

        Cafe cafe2 = new Cafe("Big Ed's");

        Scanner scanner = new Scanner(System.in);

        Customer customer1 = new Customer();

        System.out.println("What's your first name");
        customer1.setFirstName(scanner.next());

        System.out.println("What's your last name");
        customer1.setLastName(scanner.next());

        System.out.println("What's your phone number?");
        customer1.setPhoneNumber(scanner.next());

        System.out.println("Would you like to join to shop at Big Rob's or Big Ed's Cafe today?");

        String choice = scanner.next();

        if(choice.equals("Rob's")){
            cafe1.addCustomer(customer1);
        }

        System.out.println(cafe1.getCustomer(0).toString());


    }
}
