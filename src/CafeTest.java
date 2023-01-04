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

}