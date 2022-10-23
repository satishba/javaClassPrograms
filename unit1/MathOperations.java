package javaClassPrograms.unit1;

public class MathOperations {
    public static void main(String args[]){
        int exampleInt1=10,exampleInt2=20;

        float exampleFlt1=20.5f;
        float exampleFlt2=30.5f;
        float average;
        average=(exampleFlt1+exampleInt1+exampleFlt2+exampleInt2)/4;
        float mult1=exampleFlt1*exampleInt2;
        float div=exampleFlt2/exampleInt1;

        float ans=(exampleInt1*4)+((exampleFlt2*exampleInt1/exampleFlt1));
        System.out.println(average);
        System.out.println(mult1);
        System.out.println(div);
        System.out.println(ans);



    }
}
