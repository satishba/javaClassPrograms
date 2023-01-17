package interfaces;

interface variables {
    int truthVal=1;
    int falseVal =0;
}


public class variablesInterface implements variables {
    public static void main(String[] args) {
        System.out.println("Value of truth is is " + truthVal);

    }

}