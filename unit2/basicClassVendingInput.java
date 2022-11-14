package javaClassPrograms.unit2;

class userConsole {
    int cokesAvailable,waterAvailable;
    float cokePrice,waterPrice;
    void welcome(){
        System.out.println("Welcome to vending machine");
    }
    void display(){
        System.out.println("The items are ");
        System.out.println("coke = " +cokesAvailable);
        System.out.println("water = "+ waterAvailable);
        System.out.println("Price of itmes are ");
        System.out.println("Coke = " + cokePrice);
        System.out.println("water = " + waterPrice);
    }

        }

public class basicClassVendingInput {
    public static void main(String[] args) {
        userConsole dsceEEEVending = new userConsole();
        userConsole dsceECVending;
        dsceECVending = new userConsole();
        dsceEEEVending.welcome();


        dsceEEEVending.cokesAvailable=10;
        dsceEEEVending.waterAvailable=20;
        dsceEEEVending.cokePrice=20.0f;
        dsceEEEVending.waterPrice=10.0f;
        dsceECVending.cokesAvailable=30;
        dsceECVending.waterAvailable=40;
        dsceEEEVending.display();

    }


}


