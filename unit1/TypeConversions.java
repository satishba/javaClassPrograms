package javaClassPrograms.unit1;

public class TypeConversions {
    public static void main(String args []) {
    int exampleInt=259;
    byte exampleByte;
    exampleByte=(byte)exampleInt;
    System.out.println("Casted value of "+exampleInt+ "is "+exampleByte);
    float exampleFloat=102.34f;
    exampleInt = (int)exampleFloat;
    System.out.println("Casted value of "+exampleFloat+ "is "+exampleInt);
    int exampleInt2;
    exampleByte=100;
    exampleInt2=exampleByte * 4;
    System.out.println("Result exampleInt2 is promoted to int "+exampleInt2);
    exampleFloat = exampleInt2*3.5f;



    }
    }
