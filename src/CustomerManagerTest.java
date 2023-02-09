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

    @Test
    void addtoCustomerFavorites(){
        Cafe cafe7 = new Cafe();
        cafe7.customerManager.addCustomer("Johnny", "Knoxville", "6629930293");
        cafe7.menuManager.addItemToMenu(new MenuItem("NewBrew", 4.50, 35, 145, "Large"));
        cafe7.customerManager.cafeCustomers.get(0).addToFavorites(cafe7.menuManager.menuItems.get(0));
        assertEquals(cafe7.customerManager.getCustomer(0).customerFavorites.get(0).getChoiceName(), "NewBrew");
    }

    @Test
    void addToCustomerFavorites3(){
        Cafe cafe8 = new Cafe();
        Customer doodleBob = new Customer();
        cafe8.customerManager.addCustomer(doodleBob);
        MenuItem shakenEspresso = new MenuItem();
        cafe8.menuManager.addItemToMenu(shakenEspresso);
        cafe8.customerManager.addToCustomerFavorites(doodleBob, shakenEspresso);
        assertEquals(cafe8.customerManager.cafeCustomers.get(0).customerFavorites.get(0), shakenEspresso);
    }

}