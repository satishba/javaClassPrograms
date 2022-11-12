package javaClassPrograms.unit2;
class userInputwithSetGetMethods {
    int cokesAvailable, waterAvailable;
    float cokePrice, waterPrice;

    public void welcomeMessage(){
        System.out.println("Welcome to the vending machine");
    }
    public void setCokesAvailable(int cokesAvailable) {
        this.cokesAvailable = cokesAvailable;
    }

    public void setCokePrice(float cokePrice) {
        this.cokePrice = cokePrice;
    }

    public void setWaterAvailable(int waterAvailable) {
        this.waterAvailable = waterAvailable;
    }

    public void setWaterPrice(float waterPrice) {
        this.waterPrice = waterPrice;
    }

    public float getWaterPrice() {
        return waterPrice;
    }

    public float getCokePrice() {
        return cokePrice;
    }

    public int getCokesAvailable() {
        return cokesAvailable;
    }

    public int getWaterAvailable() {
        return waterAvailable;
    }
}

public class vendingClassWithMehods {
    public static void main(String[] args) {
        userInputwithSetGetMethods dsceVending = new userInputwithSetGetMethods();
        dsceVending.setCokesAvailable(10);
        dsceVending.setWaterAvailable(20);
        dsceVending.setCokePrice(20.0f);
        dsceVending.setWaterPrice(30.0f);

        System.out.print("Items available are");
        System.out.println("Cokes : " + dsceVending.getCokesAvailable() + "at " + dsceVending.getCokePrice());
        System.out.println("Cokes : " + dsceVending.getWaterAvailable() + "at " + dsceVending.getWaterPrice());

    }
}
