package unit1;

import java.util.*;
public class basicCalc {
    public static void main(String args[]) {
        System.out.println("enter two numbers\nA=\nB=\n");
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the operation to carry");
        char op = sc.next().charAt(0);
        switch(op)
        {
            case '+' : System.out.println("a+b is= "+ (a+b));
                break;

            case '-'  :   System.out.println("a-b is= "+ (a-b));
                break;
            case '*'  :  System.out.println("a*b is= "+ (a*b));
                break;
            case '/'  :  System.out.println("a/b is= "+ (a/b));
                break;

            default :
                System.out.println("invalid operator");


        }


    }
}