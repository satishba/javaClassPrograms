package javaClassPrograms.unit2;
class userInputwithMethod{
    int cokesAvailable,waterAvailable;
    float cokePrice,waterPrice;

    public void welcomeMessage(){
        System.out.println("Welcome to the vending machine");
    }

    public void setWaterPrice(float waterPrice) {
        this.waterPrice = waterPrice;
    }
}

public class vendingClassMethod1 {
    public static void main(String[] args) {
    userInputwithMethod dsceVending = new userInputwithMethod();
    dsceVending.cokesAvailable=10;
    dsceVending.waterAvailable=20;
    dsceVending.cokePrice=20.0f;
    dsceVending.waterPrice=10.0f;

    dsceVending.welcomeMessage();



    System.out.print("Items available are");
    System.out.println("Cokes : " + dsceVending.cokesAvailable + "at " + dsceVending.cokePrice);
    System.out.println("Cokes : " + dsceVending.waterAvailable + "at " + dsceVending.waterPrice);


    }



}
