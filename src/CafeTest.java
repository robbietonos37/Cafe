import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {


    @Test
    void emptyConstructor() throws SQLException, IOException {
        Cafe cafe = new Cafe();
        assertNotNull(cafe);
    }

    @Test
    void nonEmptyConstructor() throws SQLException, IOException {
        Cafe cafe = new Cafe("Big Rob's");
        assertEquals("Big Rob's", cafe.getCafeName());
    }

   @Test
    void setCafeName() throws SQLException, IOException {
        Cafe cafe = new Cafe();
        cafe.setCafeName("Robert's Cafe");
        assertEquals("Robert's Cafe", cafe.getCafeName());
   }
}