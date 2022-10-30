package javaClassPrograms.unit1;

import java.util.Scanner;

public class basicDoWhile {
    public static void main(String[] args) {
        int exampleInt1 = 0;
        Scanner inputObj = new Scanner(System.in);
        do {
            System.out.println(exampleInt1);
            exampleInt1 = inputObj.nextInt();

        } while (exampleInt1 > 10);

    }
}

