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
        this.costPerpound = 0.00;
        this.availibility = false;
        this.stock = 0;
    } // This is the default contructor
    //Add overloaded Constructor here...
    public Heart(int size, String color, String sayings, double costPerpound, boolean availibility, int stock){
        this.size = size;
        this.color = color;
        this.sayings = sayings;
        this.costPerpound = costPerpound;
        this.stock = stock;
        if(this.stock>0){
            this.availibility=true;
        }
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
    public String getReport(){
        String report="color: " + this.color + "\n" + "size: " + this.size + "\n" + "saying: " + this.sayings + "\n" + "calories: " + this.calories + "\n" + "cost: " + this.costPerpound + "\n" + "availibility: " + this.availibility + "\n" + "stock: " + this.stock;
        return report;
    }
    public void adjustPrice(double percentage){
        this.cost = this.cost + (this.price*percentage/100);
    }
    public void inStock(int stock){
        this.stock = stock;
        if(this.stock>0){
            this.availibility = true;
        }
    }
    //Add remaining Mutator methods here...
    //Write other methods here (if needed)...
}
