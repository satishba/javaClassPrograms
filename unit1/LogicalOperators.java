package javaClassPrograms.unit1;

public class LogicalOperators {
    public static void main(String args []){
        boolean example1=true,example2=false;

        boolean logicAnd=example1 & example2;
        boolean logicOr=example1 | example2;
        boolean logicXor=example1 ^ example2;
        boolean logicNot= !example1;
        System.out.println("And output "+logicAnd);
        System.out.println("Or output "+logicOr);
        System.out.println("Xor output "+logicXor);
        System.out.println("Not output "+logicNot);
        int exampleInt1=10,exampleInt2=20;
        boolean x= exampleInt1 ==0  & exampleInt2++!=10;
        System.out.println(exampleInt2);
        //shortcircuit AND and OR
        exampleInt1=10;
        exampleInt2=20;


        int y=exampleInt1 +(3*exampleInt2);


    }
}
