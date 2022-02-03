public class HeartsClient {
    public static void main(String[] args) throws Exception {
    Heart Group1 = new Heart("red",3,5.00,50);
    Heart Group2 = new Heart("teal",5,"Love CSA",4.50,200);
    Heart Group3 = new Heart("green",2,"Go Girl!",3.50,75);
    System.out.println(Group1.getReport());

    Heart [] store = newHearts[3];
    Store [0] = Group1;
    Store [1] = Group2;
    Store [2] = Group3;
    System.out.println(buyOut(store));
    }
    public static int buyOut(Heart [] Store){
        int total = 0;
        for(int i=0; i<store.length; i++){
            total = total + store[i].getStock;
        }
        return total;
    }
    public static int adjStock(Heart availibility, Heart total){
        int newStock = total;
        for(int i=0;i<total.length;i++){

        }
        return 0;
    }
    public static String order(Heart color, Heart costPerpound, Heart Stock){
    return 0;
    }
}
