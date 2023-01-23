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
    void addItemToMenu2(){
        Cafe cafeThree = new Cafe();
        cafeThree.addItemToMenu("Cold Brew", 3.75, 10, 175, "Large");
        assertEquals(cafeThree.menuItems.get(0).getCaffeineContent(), 175);
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

    @Test
    void removeItemFromMenu(){
        Cafe cafe5 = new Cafe();
        MenuItem newFrappe = new MenuItem();
        MenuItem terribleFrappe = new MenuItem();
        MenuItem awesomeFrappe = new MenuItem();
        cafe5.menuItems.add(newFrappe);
        cafe5.menuItems.add(terribleFrappe);
        cafe5.menuItems.add(awesomeFrappe);
        cafe5.menuItems.remove(1);
        assertEquals(cafe5.menuItems.get(1), awesomeFrappe);
    }

    @Test
    void removeItemFromMenu2(){
        Cafe cafe6 = new Cafe();
        MenuItem newColdBrew = new MenuItem();
        MenuItem terribleColdBrew = new MenuItem();
        MenuItem awesomeColdBrew = new MenuItem();
        cafe6.menuItems.add(newColdBrew);
        cafe6.menuItems.add(terribleColdBrew);
        cafe6.menuItems.add(awesomeColdBrew);
        cafe6.removeMenuItem(terribleColdBrew);
        assertEquals(cafe6.menuItems.get(1), awesomeColdBrew);
    }

}