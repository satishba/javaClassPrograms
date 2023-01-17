/*
WAP to take 3 strings as input from user and an integer
 as input from user and a char, and print the strings which
  have the given char at the given index
 */
package javaClassPrograms.unit3;

import java.util.Scanner;

public class stringExample1_0512 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2,s3;
        s1 = sc.next();
        s2 = sc.next();
        s3 = sc.next();

        char ch = sc.next().charAt(0);
        int index = sc.nextInt();
        if(s1.indexOf(ch) == index){
            System.out.println(s1);
        }


    }

}
