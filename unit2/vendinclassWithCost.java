package javaClassPrograms.unit2;
class userConsolewithCost {
    int cokesAvailable,waterAvailable;
    float cokePrice,waterPrice;

}
public class vendinclassWithCost {
    public static void main(String[] args) {


        userConsolewithCost dsceEEEVending = new userConsolewithCost();
        dsceEEEVending.cokePrice=10;
        dsceEEEVending.cokePrice=20.0f;
        dsceEEEVending.waterAvailable=30;
        dsceEEEVending.waterPrice=10.50f;

        System.out.print("Items available are");
        System.out.println("Cokes : " + dsceEEEVending.cokesAvailable + "at " + dsceEEEVending.cokePrice);
        System.out.println("Cokes : " + dsceEEEVending.waterAvailable + "at " + dsceEEEVending.waterPrice);
    }
}
