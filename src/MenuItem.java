import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    private int caffeineContent;

    private String choiceName;

    private double itemPrice;

    private int calorieContent;

    private String size;

    ArrayList<String> flavors = new ArrayList<>();

    MenuItem(){
        choiceName = "";
        itemPrice = 0.0;
        caffeineContent = 0;
        calorieContent = 0;
    }

    MenuItem(String name, double price, int calories, int caffeine, String Size){
        choiceName = name;
        itemPrice = price;
        calorieContent = calories;
        caffeineContent = caffeine;
        size = Size;
    }


    public int getCaffeineContent() {
        return caffeineContent;
    }

    public void setCaffeineContent(int caffeineContent) {
        this.caffeineContent = caffeineContent;
    }

    public String getChoiceName() {
        return choiceName;
    }

    public void setChoiceName(String choiceName) {
        this.choiceName = choiceName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(int calorieContent) {
        this.calorieContent = calorieContent;
    }

    public void addFlavor(String newFlavor){
        flavors.add(newFlavor);
    }

    public void setSize(String size){
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public List<String> getFlavors(){
        return flavors;
    }

    public void removeLastFlavor(){
        this.flavors.remove(this.flavors.size()-1);
    }

}
