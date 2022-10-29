package javaClassPrograms.unit1;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String args []){

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter your id");
        int id = inputObj.nextInt();

       System.out.println("User id is"+ id);
        float fl = inputObj.nextFloat();
        System.out.println("Floating number is"+fl);
        double db = inputObj.nextDouble();
        System.out.println("Double number is"+db);
        char ch = inputObj.next().charAt(0);
        System.out.println("Char is "+ch);




    }
}
