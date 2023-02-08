import java.util.ArrayList;

public class Cafe {

    private String cafeName;

    MenuManager menuManager = new MenuManager();

    CustomerManager customerManager = new CustomerManager();

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


}
