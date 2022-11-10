package javaClassPrograms.unit1;

import java.util.Scanner;

public class basicWhile {
    public static void main(String[] args) {
        int exampleInt=0,sum=0,exampleChar='y';
        Scanner inputObj = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0;i<4;i++){
            arr[i]=inputObj.nextInt();
        }

        for(int i=0;i<4;i++){
            exampleChar = 'y';
            if(arr[i]==0){
                continue;
            }
            if(arr[i]%2 ==0) {
                while (exampleChar != 'n') {
                    System.out.println("Hello");
                    exampleChar = inputObj.next().charAt(0);
                }
            }
                else {
                while(exampleChar != 'n'){
                    System.out.println("Hello");
                    exampleChar = inputObj.next().charAt(0);
                }

                }


    }

    }
}
