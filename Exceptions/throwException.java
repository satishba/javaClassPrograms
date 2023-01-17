package Exceptions;

import java.util.Scanner;

public class throwException {
    public static void main(String[] args) {


        try {
            int x = 10;
            Scanner in = new Scanner(System.in);
            int div = in.nextInt();
            if (div == 0) {
                throw new ArithmeticException("I1");
            }
            int y = 10 / div;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

