package javaClassPrograms.unit1;

import java.util.Scanner;

public class cie1_5a {
    public static void main(String[] args) {

        Scanner inputObj = new Scanner(System.in);

        int fib[]={0,1,1,2,3,5,8,13,21,34};
        int len=inputObj.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=inputObj.nextInt();
        }
        for(int x:arr){
            for(int y:fib){
                if(x==y){
                    System.out.println(x+"Part of fib series");
                }
            }
        }
    }

}
