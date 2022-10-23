package javaClassPrograms.unit1;

public class RelationalOperators {
    public static void main(String args []){
        int example1=10,example2=20;
        boolean relationEqual,relationLt,relationGt,relationNe;
        relationEqual = example1 == 15;
        System.out.println(relationEqual);

        relationGt = example1 > example2;
        System.out.println(relationGt);

        relationLt = example1 < example2;
        System.out.println(relationLt);

        relationNe = example1 != example2;
        System.out.println(relationNe);



    }
}
