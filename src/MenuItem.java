public class MenuItem {

    private int caffeineContent;

    private String choiceName;

    private double itemPrice;

    private int calorieContent;

    private String size;

    MenuItem(){
        choiceName = "";
        itemPrice = 0.0;
        caffeineContent = 0;
        calorieContent = 0;
    }

    MenuItem(String name, double price, int calories, int caffeine){
        choiceName = name;
        itemPrice = price;
        calorieContent = calories;
        caffeineContent = caffeine;
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
}
