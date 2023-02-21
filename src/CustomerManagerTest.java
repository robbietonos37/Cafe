import org.junit.jupiter.api.Test;

import java.awt.*;

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

    @Test
    void payForOrder(){
        Cafe cafe9 = new Cafe();
        Customer doodleBobber = new Customer();
        MenuItem shakenEspresso = new MenuItem();
        MenuItem shakenEspresso1 = new MenuItem();
        MenuItem shakenEspresso2 = new MenuItem();
        shakenEspresso.setItemPrice(4.75);
        shakenEspresso1.setItemPrice(5.75);
        shakenEspresso2.setItemPrice(6.75);
        cafe9.customerManager.addCustomer(doodleBobber);
        cafe9.menuManager.addItemToMenu(shakenEspresso);
        cafe9.menuManager.addItemToMenu(shakenEspresso1);
        cafe9.menuManager.addItemToMenu(shakenEspresso2);
        cafe9.customerManager.getCustomer(0).addToOrder(shakenEspresso);
        cafe9.customerManager.getCustomer(0).addToOrder(shakenEspresso1);
        cafe9.customerManager.getCustomer(0).addToOrder(shakenEspresso2);
        cafe9.customerManager.getCustomer(0).payForOrder();
        assertEquals(cafe9.customerManager.getCustomer(0).getTotalLifetimeSpend(), 17.25);
    }

    @Test
    void addToCustomerOrder(){
        Cafe cafe = new Cafe();
        Customer roberto = new Customer();
        MenuItem newBrew = new MenuItem();
        MenuItem newBrew1 = new MenuItem();
        newBrew.setItemPrice(3.85);
        newBrew1.setItemPrice(4.15);
        cafe.customerManager.addCustomer(roberto);
        cafe.customerManager.addToCustomerOrder(roberto,newBrew);
        cafe.customerManager.addToCustomerOrder(roberto,newBrew1);
        assertTrue(cafe.customerManager.getCustomer(0).customerOrder.size() == 2);
    }

}