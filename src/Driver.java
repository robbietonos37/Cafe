public class Driver {

    public static void main(String[] args) {
        Cafe RobsCafe = new Cafe("Big Rob's Cafe");

        RobsCafe.addCustomer("Robert", "Tonos", "6019552504");

        Cafe EdsCafe = new Cafe("Big Rob's Cafe");

        EdsCafe.addCustomer("Robert", "Tonos", "6019552504");

        System.out.println(RobsCafe.getCustomer(0).toString());

        RobsCafe.addItemToMenu("Cold Brew", 3.15, 5, 155, "Small");

        RobsCafe.cafeCustomers.get(0).addToOrder(RobsCafe.menuItems.get(0));

        RobsCafe.cafeCustomers.get(0).payForOrder();

        EdsCafe.addItemToMenu("Cold Brew", 3.15, 5, 155, "Small");

        EdsCafe.cafeCustomers.get(0).addToOrder(RobsCafe.menuItems.get(0));

        EdsCafe.cafeCustomers.get(0).payForOrder();

        System.out.println(RobsCafe.cafeCustomers.get(0).getTotalLifetimeSpend());

        System.out.println(EdsCafe.cafeCustomers.get(0).getTotalLifetimeSpend());
    }
}
