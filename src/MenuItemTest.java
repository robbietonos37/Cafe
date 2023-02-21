import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class MenuItemTest {

    @Test
    void emptyConstructor(){
        MenuItem menuItem = new MenuItem();
        assertNotNull(menuItem);
    }

    @Test
    void nonEmptyConstructor(){
        MenuItem menuItem = new MenuItem("Cold Brew", 3.75,15,205,"Large");
        assertEquals("Cold Brew", menuItem.getChoiceName());
    }

    @Test
    void nonEmptyConstructor2(){
        MenuItem menuItem = new MenuItem("Shaken Espresso", 5.25, 115, 185, "Venti");
        assertEquals(5.25, menuItem.getItemPrice());
    }

    @Test
    void nonEmptyConstructor3(){
        MenuItem menuItem = new MenuItem("Iced Chai", 4.35,85,130,"Grande");
        assertEquals(85,menuItem.getCalorieContent());
    }

    @Test
    void nonEmptyConstructor4(){
        MenuItem menuItem = new MenuItem("Iced Americano", 2.95,10,120,"Tall");
        assertEquals(120,menuItem.getCaffeineContent());
    }

    @Test
    void nonEmptyConstructor5(){
        MenuItem menuItem = new MenuItem("Iced Americano", 2.95,10,120,"Tall");
        assertEquals(120,menuItem.getCaffeineContent());
    }

    @Test
    void setCaffeineContent(){
        MenuItem menuItem = new MenuItem();
        menuItem.setCaffeineContent(255);
        assertEquals(255,menuItem.getCaffeineContent());
    }

    @Test
    void setChoiceName(){
        MenuItem menuItem = new MenuItem();
        menuItem.setChoiceName("Coffee1");
        assertEquals("Coffee1",menuItem.getChoiceName());
    }

    @Test
    void setCalorieContent(){
        MenuItem menuItem = new MenuItem();
        menuItem.setCalorieContent(210);
        assertEquals(210,menuItem.getCalorieContent());
    }

    @Test
    void setSize(){
        MenuItem menuItem = new MenuItem();
        menuItem.setSize("Grande");
        assertEquals("Grande",menuItem.getSize());
    }

    @Test
    void addFlavor(){
        MenuItem menuItem = new MenuItem();
        menuItem.addFlavor("Moca");
        menuItem.addFlavor("Caramel");
        assertEquals(2, menuItem.getFlavors().size());
    }

}