package javaClassPrograms.unit1;

import java.util.Scanner;

public class basicForEach {
    public static void main(String[] args) {
        int tempArr [] = new int[4];
        Scanner inputObj = new Scanner(System.in);
        for(int i=0;i< 4 ;i++){
            tempArr[i]=inputObj.nextInt();
        }
        for(int x : tempArr){
            System.out.println(x);
        }
    }
}
