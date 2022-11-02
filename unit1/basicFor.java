package javaClassPrograms.unit1;

import java.util.Scanner;

public class basicFor {
    public static void main(String[] args) {
        int exampleInt;


        for(int i=0;i<10;i++){
            System.out.println(i);
        }


        Scanner inputObj = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0;i<4;i++){
            arr[i]=inputObj.nextInt();
        }
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
    }
}
