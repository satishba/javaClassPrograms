package javaClassPrograms.unit1;
import java.util.Scanner;
public class arrIncr {
    public static void main(String args[])
    {

        Scanner ip=new Scanner(System.in);
        int size = ip.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++)
        {
            a[i]=ip.nextInt();
        }
        System.out.println("Enter the lowerlimit");
        int lowerLimit = ip.nextInt();
        System.out.println("Enter the upper limit");
        int upperLimit = ip.nextInt();
        for(int x:a)
        {
        if(x > lowerLimit && x < upperLimit) {
            System.out.println(x + "Is with in range");
        }
        }
    }
}



