public class HeartsClient {
    public static void main(String[] args) throws Exception {
        /*Heart newHeart = new Heart();
        newHeart.setAvailibility(true);
        newHeart.setColor("blue");
        newHeart.setCalories(0);
        newHeart.setSayings("Hello");
        newHeart.setCostperPound(4.75);
        newHeart.setStock(20);
        System.out.println("The heart is the color: " + newHeart.getColor());
        System.out.println("The heart is availible: " + newHeart.getavailibility());
        System.out.println("The heart has this many calories: " + newHeart.getCalories());
        System.out.println("The heart says this: " + newHeart.getSayings());
        System.out.println("The heart costs this much per pound: $" + newHeart.getCostPerPound());
        System.out.println("The hearts have this much in stock: " + newHeart.getStock());
    */
    Heart Group1 = new Heart();
    Heart Group2 = new Heart();
    Heart Group3 = new Heart();
        Group1.setAvailibility(true);
        Group1.setColor("red");
        Group1.setSize(3);
        Group1.setSayings("Hi");
        Group1.setCostperPound(5.00);
        Group1.setStock(50);
        Group2.setAvailibility(true);
        Group2.setColor("teal");
        Group2.setSize(5);
        Group2.setCostperPound(4.50);
        Group2.setSayings("Love CS-A");
        Group2.setStock(200);
        Group3.setAvailibility(true);
        Group3.setColor("green");
        Group3.setSize(2);
        Group3.setSayings("Go Girl!");
        Group3.setCostperPound(3.50);
        Group3.setStock(75);
        System.out.println("color: " + Group1.getColor());
        System.out.println("size: " + Group1.getSize());
        System.out.println("saying: " + Group1.getSayings());
        System.out.println("cost: " + Group1.getCostPerPound());
        System.out.println("stock: " + Group1.getStock());
    }
}
