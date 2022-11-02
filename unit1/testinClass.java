package javaClassPrograms.unit1;
import java.util.Scanner;
public class testinClass {
    public static void main(String[] args) {

        int arr[] = new int[3];
        Scanner inputObj = new Scanner(System.in);
        arr[0] = inputObj.nextInt();
        arr[1] = inputObj.nextInt();
        arr[2] = inputObj.nextInt();
        arr[3] = inputObj.nextInt();
        System.out.println(arr[0] + arr[1] + arr[3] + arr[4]);
    }
}


