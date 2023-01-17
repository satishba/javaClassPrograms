package Exceptions;

import java.util.Scanner;

public class excpetionandContinue {

    public static void main (String[]args){
        int input = 0;

        while (input != 1) {
            try {
                int x = 10;
                Scanner in = new Scanner(System.in);
                int div = in.nextInt();
                int y = 10 / div;
                input = 1;
            }        catch(ArithmeticException e){
                System.out.println("Do no Enter 0");
            }
            catch(NullPointerException e){
                System.out.println("Object not created");
            }
        }
    }
}
