import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void emptyConstructorTest(){
        Customer customer1 = new Customer();
        assertNotNull(customer1);
    }

    @Test
    void nonEmptyConstructorTest(){
        Customer customer2 = new Customer("Robbie","Tonos", "6019552504");
        assertEquals(customer2.getFirstName(),"Robbie");
    }
    @Test
    void addToOrderTest(){
        Customer customer3 = new Customer();
        Cafe cafeTest = new Cafe();
        MenuItem testFrappe = new MenuItem();
        cafeTest.addItemToMenu(testFrappe);
        cafeTest.addCustomer(customer3);
        cafeTest.getCustomer(0).addToOrder(testFrappe);
        assertEquals(cafeTest.getCustomer(0).customerOrder.get(0),testFrappe);
    }

    @Test
    void payForOrderTest(){
        Customer customer4 = new Customer();
        Cafe cafeTest2 = new Cafe();
        MenuItem coldBrewSki = new MenuItem();
        coldBrewSki.setItemPrice(4.50);
        cafeTest2.addItemToMenu(coldBrewSki);
        cafeTest2.addCustomer(customer4);
        cafeTest2.getCustomer(0).addToOrder(coldBrewSki);
        cafeTest2.getCustomer(0).payForOrder();
        assertEquals(cafeTest2.getCustomer(0).getTotalLifetimeSpend(), 4.50);
    }

}