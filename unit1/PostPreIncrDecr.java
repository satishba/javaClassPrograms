package javaClassPrograms.unit1;

public class PostPreIncrDecr {
    public static void main(String arg []){
        int x=10,preIncr,postIncr,preDecr,postDecr;
        preIncr=++x;
        x=10;
        postIncr=x++;
        System.out.println("Pre increment "+preIncr);
        System.out.println("Post increment"+postIncr);
        x=10;
        preDecr=--x;
        x=10;
        postDecr=x--;
        System.out.println("Pre increment "+preDecr);
        System.out.println("Post increment"+postDecr);

    }
}
