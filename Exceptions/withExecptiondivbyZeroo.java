package Exceptions;

import java.util.Scanner;

public class withExecptiondivbyZeroo {



        public static void main (String[]args){
    try {
        int x = 10;
        Scanner in = new Scanner(System.in);
        int div = in.nextInt();
        int y = 10 / div;
        System.out.println("After division");
    }
    catch(ArithmeticException e) {
        System.out.println("Do no Enter 0");
        }
    }

}
