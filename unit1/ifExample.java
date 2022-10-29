package javaClassPrograms.unit1;

import java.util.Scanner;

public class ifExample {
    public static void main(String args []){
        int exampleInt1;
        boolean compare;
        System.out.println("Enter an integer");
        Scanner inputObj = new Scanner(System.in);
        exampleInt1 = inputObj.nextInt();
        compare = exampleInt1 > 10;
        if(compare) {
            System.out.println("Value entered is greater than 10");
        }

    }
}
