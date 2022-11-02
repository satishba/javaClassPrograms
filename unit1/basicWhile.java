package javaClassPrograms.unit1;

import java.util.Scanner;

public class basicWhile {
    public static void main(String[] args) {
        int exampleInt;
        Scanner inputobj = new Scanner(System.in);

        exampleInt = inputobj.nextInt();
        while (exampleInt < 10) {
            System.out.println("Number is " + exampleInt);
            exampleInt = exampleInt + 1;
        }
    }
}
