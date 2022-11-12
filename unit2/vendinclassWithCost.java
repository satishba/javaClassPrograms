package javaClassPrograms.unit2;
class userInputwithCost{
    int cokesAvailable,waterAvailable;
    float cokePrice,waterPrice;

}
public class vendinclassWithCost {
    public static void main(String[] args) {


        userInputwithCost dsceVending = new userInputwithCost();
        dsceVending.cokePrice=10;
        dsceVending.cokePrice=20.0f;
        dsceVending.waterAvailable=30;
        dsceVending.waterPrice=10.50f;

        System.out.print("Items available are");
        System.out.println("Cokes : " + dsceVending.cokesAvailable + "at " + dsceVending.cokePrice);
        System.out.println("Cokes : " + dsceVending.waterAvailable + "at " + dsceVending.waterPrice);
    }
}
