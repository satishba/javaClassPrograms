package javaClassPrograms.unit1;

import java.util.Scanner;

public class basicSwitch {
    public static void main(String[] args) {
        int exampleInt;
        Scanner inputObj = new Scanner(System.in);
        exampleInt = inputObj.nextInt();
        switch (exampleInt){

            case 1:
                System.out.println("Value entered was one");
                break;
            case 2:
                System.out.println("Value Entered was two");
                break;
            case 3:
                System.out.println("Value Entered was three");
                break;
            default:
                System.out.println("Invalid Entry");

        }
    }
}

