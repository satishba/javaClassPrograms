package javaClassPrograms.unit1;

import java.util.Scanner;

public class cie1_5b {

        public static void main(String[] args) {

            Scanner inputObj = new Scanner(System.in);

            int len=inputObj.nextInt();
            int arr[] = new int[len];
            for(int i=0;i<len;i++){
                arr[i]=inputObj.nextInt();
            }
            for(int i=0;i<len;i++){
                for(int j=0;j<len;j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }
            for(int x:arr){
            System.out.println(x);
            }
            int consecutive=1;
            int lastEle=0;
            int newArr[];
            for(int i=1;i<len;i++){
                int flag = 0;
                if(arr[i]-arr[i-1] == 1){
                    consecutive=consecutive+1;
                    flag=1;
                    if(i==len-1){
                        lastEle=1;
                        flag=0;
                    }
                }
                if(consecutive > 1 && flag == 1  && lastEle == 0) {
                    continue;
                }

                else if(consecutive > 1 && flag ==0){
                    newArr = new int[consecutive];
                    System.out.println("consecutive elements are");

                    int temp = lastEle == 0 ?i-1:i;
                    for(int j=0;j<consecutive;j++){

                        newArr[j] = arr[temp-(consecutive-1)];
                        temp=temp+1;
                    }
                    consecutive=1;
                    for(int x:newArr){
                        System.out.print(x+" ,");
                }
                    System.out.println();

                }

            }

        }

    }


