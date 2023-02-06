import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuManagerTest {

    @Test
    void addItemToMenu(){
        Cafe cafe3 = new Cafe();
        MenuItem newItem = new MenuItem();
        cafe3.menuManager.addItemToMenu(newItem);
        assertNotNull(cafe3.menuManager.menuItems.get(0));
    }

    @Test
    void addItemToMenu2(){
        Cafe cafeThree = new Cafe();
        cafeThree.menuManager.addItemToMenu("Cold Brew", 3.75, 10, 175, "Large");
        assertEquals(cafeThree.menuManager.menuItems.get(0).getCaffeineContent(), 175);
    }

    @Test
    void removeItemFromMenu(){
        Cafe cafe5 = new Cafe();
        MenuItem newFrappe = new MenuItem();
        MenuItem terribleFrappe = new MenuItem();
        MenuItem awesomeFrappe = new MenuItem();
        cafe5.menuManager.menuItems.add(newFrappe);
        cafe5.menuManager.menuItems.add(terribleFrappe);
        cafe5.menuManager.menuItems.add(awesomeFrappe);
        cafe5.menuManager.menuItems.remove(1);
        assertEquals(cafe5.menuManager.menuItems.get(1), awesomeFrappe);
    }

    @Test
    void removeItemFromMenu2(){
        Cafe cafe6 = new Cafe();
        MenuItem newColdBrew = new MenuItem();
        MenuItem terribleColdBrew = new MenuItem();
        MenuItem awesomeColdBrew = new MenuItem();
        cafe6.menuManager.menuItems.add(newColdBrew);
        cafe6.menuManager.menuItems.add(terribleColdBrew);
        cafe6.menuManager.menuItems.add(awesomeColdBrew);
        cafe6.menuManager.removeMenuItem(terribleColdBrew);
        assertEquals(cafe6.menuManager.menuItems.get(1), awesomeColdBrew);
    }

}