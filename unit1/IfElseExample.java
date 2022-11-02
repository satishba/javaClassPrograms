package javaClassPrograms.unit1;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String args[]) {
        int studentMarksAdc,studentMarksJava ;
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the marks scored in ADC");
        studentMarksAdc = inputObj.nextInt();
        System.out.println("Enter the marks scored in Java");
        studentMarksJava = inputObj.nextInt();
        boolean compare = studentMarksAdc > studentMarksJava;
        if(studentMarksAdc > studentMarksJava){
            System.out.println("Student scored more in ADC");
        }
        else {
            System.out.println("Student Scored more in Java");
        }
    }
}
