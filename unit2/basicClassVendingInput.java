package javaClassPrograms.unit2;


class userInput{
    int cokesAvailable,waterAvailable;
        }

public class basicClassVendingInput {
    public static void main(String[] args) {
        userInput dsceVending;
        dsceVending = new userInput();
        dsceVending.cokesAvailable=10;
        dsceVending.waterAvailable=20;
        System.out.println("The items available are coke = "+dsceVending.cokesAvailable + "and water = " + dsceVending.waterAvailable);

    }


}


