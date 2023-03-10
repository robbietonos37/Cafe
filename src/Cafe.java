import java.io.IOException;
import java.sql.SQLException;

public class Cafe {

    private String cafeName;

    MenuManager menuManager = new MenuManager();

    CustomerManager customerManager = new CustomerManager();

    Cafe() throws SQLException, IOException {
        cafeName = "";
    }

    Cafe(String name) throws SQLException, IOException {
        cafeName = name;
    }

    public void setCafeName(String cafeName){
        this.cafeName = cafeName;
    }

    public String getCafeName(){
        return cafeName;
    }


}
