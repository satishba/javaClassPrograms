/*
Take a string as input from user , if user enters a string greater then 10 char ask to reneter as long as he does not enter less then 10 char.
Identify if the string starts with "The" if yes print the 4th char
if no
print the third char.

*/
package javaClassPrograms.unit3;

import jdk.internal.platform.cgroupv1.SubSystem;

import java.util.Scanner;


public class StringExample {
    public static void main(String[] args) {
        String name="Test this string";


        char ch1[] = {'h','e','l','l','o'};
        String s1 = new String(ch1,2,2);
        System.out.println(s1);

        String s2 = new String(s1);
        Scanner input = new Scanner(System.in);
        String testString = input.next();
        System.out.println("length of string is "+testString.length());

        String name2="Test this String";
        char test[] = new char[4];
        name2.getChars(2,6,test,0);
        System.out.println( name2.toCharArray()[0]);

        System.out.println("char at the 5th position is "+name2.charAt(5));



        String password="mypass";
        /*System.out.println("Enter the password");
        String givenPass = input.next();
        if(givenPass.equals(password)){
            System.out.println("Passwords match");
        }
        else {
            System.out.println("Invalid password");
        }*/
        if(name2.startsWith("this",5)){
            System.out.println("String starts with Test");
        }
        System.out.println(name2.indexOf('t',6));
        String name3="  Test this String   ";
      String subSstring = name3.substring(10,12);
        String newName = name3.replace('S','s');
        System.out.println(newName);
        System.out.println(name3.trim());

    }
}
