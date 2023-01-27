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

}