import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void emptyConstructorTest(){
        Customer customer1 = new Customer();
        assertNotNull(customer1);
    }

}