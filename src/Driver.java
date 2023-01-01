public class Driver {

    public static void main(String[] args) {
        Cafe RobsCafe = new Cafe("Big Rob's Cafe");

        RobsCafe.addCustomer("Robert", "Tonos", "6019552504");

        System.out.println(RobsCafe.getCustomer(0).toString());
    }
}
