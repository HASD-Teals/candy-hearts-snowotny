public class HeartsClient {
    public static void main(String[] args) throws Exception {
        Heart newHeart = new Heart();
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
    }
}
