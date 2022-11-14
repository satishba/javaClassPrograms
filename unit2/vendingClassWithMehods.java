package javaClassPrograms.unit2;
class userConsolewithSetGetMethods {
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
        userConsolewithSetGetMethods dsceEEEVending = new userConsolewithSetGetMethods();
        dsceEEEVending.setCokesAvailable(10);
        dsceEEEVending.setWaterAvailable(20);
        dsceEEEVending.setCokePrice(20.0f);
        dsceEEEVending.setWaterPrice(30.0f);

        System.out.print("Items available are");
        System.out.println("Cokes : " + dsceEEEVending.getCokesAvailable() + "at " + dsceEEEVending.getCokePrice());
        System.out.println("Cokes : " + dsceEEEVending.getWaterAvailable() + "at " + dsceEEEVending.getWaterPrice());

    }
}
