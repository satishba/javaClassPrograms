package Exceptions;

import java.util.Scanner;
class div {

}
public class throwsException {
    static  void div() throws ArithmeticException {

            int x = 10;
            Scanner in = new Scanner(System.in);
            int div = in.nextInt();
            throw new ArithmeticException("Divide by zero");

            //int y = 10 / div;


    }
    public static void main(String[] args) {

       try {
            div();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
