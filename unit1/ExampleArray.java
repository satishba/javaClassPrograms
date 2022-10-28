package javaClassPrograms.unit1;

public class ExampleArray {
    public static void main(String args[]){
    int marks[];
    marks = new int[4];
    int i=0;
    marks[i]=10;
    marks[1]=20;
    marks[2]=30;
    marks[3]=40;


    int tempArr[] = new int[4];
    tempArr[0]=10;
    int tempArr2[]= {1,3,5,6};

    float average = (marks[0]+marks[1]+marks[2]+marks[3])/4.0f;
    System.out.println("The average marks is "+marks[5]);
    double temprature[];
    temprature = new double[3];
    temprature[0]=20.1;
    temprature[1]=3.2;
    temprature[2]=32.4;
    System.out.println("temprature is"+temprature[0]);
    /* Two dimensional array  */

    int twoD[][] = new int[2][2];

    twoD[0][0]=1;
    twoD[0][1]=2;
    twoD[1][0]=3;
    twoD[1][1]=4;

    System.out.println("second elemen is"+twoD[0][1]);

    float twoD1 [] [] = { {1.0f,2.0f},{3.0f,4.0f}};

    char name [] = {'J','A','V','A'};
    System.out.print(name[0] + "" + name[1] + "" + name[2] +""+ name[3]);


    }
}
