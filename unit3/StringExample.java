/*
Take a string as input from user , if user enters a string greater then 10 char ask to reneter as long as he does not enter less then 10 char.
Identify if the string starts with "The" if yes print the 4th char
if no
print the third char.

*/
import java.util.Scanner;


public class StringExample {
    public static void main(String[] args) {
        String name="Test this string";
        String name2="Test this String";
        Scanner input = new Scanner(System.in);
        String x;
        do {
            x = input.next();
        }while(x.length()>4);
        if(x.startsWith("The")){
            System.out.println(x.charAt(3));
        }
        else{
            System.out.println(x.charAt(2));
        }



    }
}
