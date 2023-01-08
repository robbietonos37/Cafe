import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void emptyConstuctor(){
        Cafe cafe = new Cafe();
        assertNotNull(cafe);
    }

    @Test
    void nonEmptyConstructor(){
        Cafe cafe = new Cafe("Big Rob's");
        assertEquals("Big Rob's", cafe.getCafeName());
    }

    @Test
    void addCustomer(){
        Cafe cafe = new Cafe();
        cafe.addCustomer("Edward", "Tonos", "6019400619");
        assertNotNull(cafe.getCustomer(0));
    }

    @Test
    void addCustomer2(){
        Cafe cafe = new Cafe();
        Customer person1 = new Customer();
        cafe.addCustomer(person1);
        assertNotNull(cafe.getCustomer(0));
    }

    @Test
    void addItemToMenu(){
        Cafe cafe3 = new Cafe();
        MenuItem newItem = new MenuItem();
        cafe3.addItemToMenu(newItem);
        assertNotNull(cafe3.menuItems.get(0));
    }

    @Test
    void addItemToCustomerFavorites(){
        Cafe cafe4 = new Cafe();
        Customer newbie = new Customer();
        MenuItem newCoffee = new MenuItem();
        cafe4.addCustomer(newbie);
        cafe4.getCustomer(0).addToFavorites(newCoffee);
        assertNotNull(cafe4.getCustomer(0).customerFavorites.get(0));
    }

}