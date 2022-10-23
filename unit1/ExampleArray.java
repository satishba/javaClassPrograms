package javaClassPrograms.unit1;

import java.awt.*;

public class ExampleArray {
    public static void main(String args[]){
    int marks[];
    marks = new int[4];
    marks[0]=10;
    marks[1]=20;
    marks[2]=30;
    marks[3]=40;

    System.out.println("The second element in the array is"+marks[1]);
    double temprature[];
    temprature = new double[3];
    temprature[0]=20.1;
    temprature[1]=3.2;
    temprature[2]=32.4;
    System.out.println("temprature is"+temprature[0]);
    /* Two dimensional array  */

    int twoD[][] = new int[2][2];

    twoD[0][0]=1;
    twoD[0][1]=2;
    twoD[1][0]=3;
    twoD[1][1]=4;

    System.out.println("second elemen is"+twoD[0][1]);

    float twoD1 [] [] = { {1.0f,2.0f},{3.0f,4.0f}};



    }
}
