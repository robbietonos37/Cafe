import java.util.ArrayList;

public class Cafe {

    private String cafeName;

    MenuManager menuManager = new MenuManager();

    Cafe(){
        cafeName = "";
    }

    Cafe(String name){
        cafeName = name;
    }

    public void setCafeName(String cafeName){
        this.cafeName = cafeName;
    }

    public String getCafeName(){
        return cafeName;
    }

    public void addToCustomerFavorites(Customer customer, MenuItem menuItem){
        customer.addToFavorites(menuItem);
    }

}
