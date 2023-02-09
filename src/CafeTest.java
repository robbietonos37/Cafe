import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {


    @Test
    void emptyConstructor(){
        Cafe cafe = new Cafe();
        assertNotNull(cafe);
    }

    @Test
    void nonEmptyConstructor(){
        Cafe cafe = new Cafe("Big Rob's");
        assertEquals("Big Rob's", cafe.getCafeName());
    }

    /*

    @Test
    void addtoCustomerFavorites(){
        Cafe cafe7 = new Cafe();
        cafe7.addCustomer("Johnny", "Knoxville", "6629930293");
        cafe7.addItemToMenu(new MenuItem("NewBrew", 4.50, 35, 145, "Large"));
        cafe7.cafeCustomers.get(0).addToFavorites(cafe7.menuItems.get(0));
        assertEquals(cafe7.getCustomer(0).customerFavorites.get(0).getChoiceName(), "NewBrew");
    }

     */



}