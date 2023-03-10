import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void emptyConstructorTest(){
        Customer customer1 = new Customer();
        assertNotNull(customer1);
    }

    @Test
    void setPhoneNumber(){
        Customer customerOne = new Customer();
        customerOne.setPhoneNumber("6019880000");
        assertEquals(customerOne.getPhoneNumber(), "6019880000");
    }

    @Test
    void nonEmptyConstructorTest(){
        Customer customer2 = new Customer("Robbie","Tonos", "6019552504", "ret");
        assertEquals(customer2.getFirstName(),"Robbie");
    }

    @Test
    void nonEmptyConstructorTest2(){
        Customer customer = new Customer("Big", "Rob", "6623235656", "ret");
        assertEquals("Rob",customer.getLastName());
    }

    @Test
    void setLastName(){
        Customer customerTwo = new Customer();
        customerTwo.setLastName("Adams");
        assertEquals(customerTwo.getLastName(), "Adams");
    }

    @Test
    void addToOrderTest(){
        Customer customer3 = new Customer();
        MenuItem testFrappe = new MenuItem();
        customer3.addToOrder(testFrappe);
        assertEquals(customer3.customerOrder.get(0), testFrappe);
    }

    @Test
    void payForOrderTest(){
        Customer customer4 = new Customer();
        MenuItem coldBrewSki = new MenuItem();
        coldBrewSki.setItemPrice(4.50);
        customer4.addToOrder(coldBrewSki);
        customer4.payForOrder();
        assertEquals(customer4.getTotalLifetimeSpend(), 4.50);
    }

    @Test
    void payForOrderTest2(){
        Customer customerFour = new Customer();
        MenuItem coldBrew10 = new MenuItem();
        coldBrew10.setItemPrice(4.33);
        customerFour.addToOrder(coldBrew10);
        customerFour.payForOrder();
        assertEquals(customerFour.customerOrder.size(), 0);
    }

    @Test
    void getTotalOrderCost(){
        Customer customer5 = new Customer();
        MenuItem coldBrewer = new MenuItem();
        coldBrewer.setItemPrice(3.75);
        customer5.addToOrder(coldBrewer);
        assertEquals(customer5.getTotalCost(), 3.75);
    }

    @Test
    void getCustomerPoints(){
        Customer customer6 = new Customer();
        MenuItem coldBrew3 = new MenuItem();
        coldBrew3.setItemPrice(4.75);
        customer6.addToOrder(coldBrew3);
        MenuItem coldBrew4 = new MenuItem();
        coldBrew4.setItemPrice(5.75);
        customer6.addToOrder(coldBrew4);
        customer6.payForOrder();
        assertEquals(customer6.getPoints(), 10);
    }

    @Test
    void addTotalAmountSpentToCustomer(){
        Customer customerSix = new Customer();
        customerSix.updateLifeTimeSpend(7.5);
        assertEquals(customerSix.getTotalLifetimeSpend(), 7.5);
    }

    @Test
    void addToCustomerPoints(){
        Customer customerSeven = new Customer();
        customerSeven.updatePoints(13);
        assertEquals(customerSeven.getPoints(), 13);
    }


}