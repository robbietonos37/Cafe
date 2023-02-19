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

   @Test
    void setCafeName(){
        Cafe cafe = new Cafe();
        cafe.setCafeName("Robert's Cafe");
        assertEquals("Robert's Cafe", cafe.getCafeName());
   }
}