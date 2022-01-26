public class Heart {
    // PROPERTIES
    private String color;
    private int size;
    private String sayings;
    private int calories;
    private double costPerpound;
    private boolean availibility;
    private int stock;

    // CONSTRUCTORS
    public Heart() {
        this.size = 0;
        this.color = "";
        this.sayings = "";
        this.calories = 0;
        this.costPerpound = 0.0;
        this.availibility = false;
        this.stock = 0;
    } // This is the default contructor
    //Add overloaded Constructor here...
    public Heart(int size, String color, String sayings, int calories, double costPerpound, boolean availibility, int stock){
        this.size = size;
        this.color = color;
        this.sayings = sayings;
        this.calories = calories;
        this.costPerpound = costPerpound;
        this.availibility = availibility;
        this.stock = stock;
    }

    // ACCESSORS
    public int getSize(){
        return this.size;
    }
    public String getColor() {
        return this.color;
    }
    public String getSayings(){
        return this.sayings;
    }
    public int getCalories(){
        return this.calories;
    }
    public double getCostPerPound(){
        return this.costPerpound;
    }
    public boolean getavailibility(){
        return this.availibility;
    }
    public int getStock(){
        return this.stock;
    }
    //Add remaining Accessor methods here...


    // MUTATORS
    public void setSize(int size){
        this.size = size;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSayings(String sayings){
        this.sayings = sayings;
    }
    public void setCalories(int calories){
        this.calories = calories;
    }
    public void setCostperPound(double costPerpound){
        this.costPerpound = costPerpound;
    }
    public void setAvailibility(boolean availibility){
        this.availibility = availibility;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
    //Add remaining Mutator methods here...


    // METHODS
    /*public String report() {
        return this.color + "\n"; // Add other properties here as you add them to the class
        return this.sayings + "\n";
        return this.calories + "\n";
        return this.costPerpound + "\n";
        return this.availibility + "\n";
        return this.stock + "\n";
    }*/
    //Write other methods here (if needed)...
}
