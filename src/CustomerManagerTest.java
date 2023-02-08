import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerManagerTest {

    @Test
    void addCustomer(){
        Cafe cafe = new Cafe();
        cafe.customerManager.addCustomer("Edward", "Tonos", "6019400619");
        assertNotNull(cafe.customerManager.getCustomer(0));
    }

    @Test
    void addCustomer2(){
        Cafe cafe = new Cafe();
        Customer person1 = new Customer();
        cafe.customerManager.addCustomer(person1);
        assertNotNull(cafe.customerManager.getCustomer(0));
    }

    @Test
    void addItemToCustomerFavorites(){
        Cafe cafe4 = new Cafe();
        Customer newbie = new Customer();
        MenuItem newCoffee = new MenuItem();
        cafe4.customerManager.addCustomer(newbie);
        cafe4.customerManager.getCustomer(0).addToFavorites(newCoffee);
        assertNotNull(cafe4.customerManager.getCustomer(0).customerFavorites.get(0));
    }

}