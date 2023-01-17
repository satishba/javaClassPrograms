package Exceptions;

import java.util.Scanner;

public class finallyException {
    public static void main (String[]args){
        try {
            int x = 10;
            Scanner in = new Scanner(System.in);
            int div = in.nextInt();
            int y = 10 / div;
        }
        catch(ArithmeticException e) {
            System.out.println("Do no Enter 0");
        }
        finally {
            System.out.println("Finished");
        }
    }
}
