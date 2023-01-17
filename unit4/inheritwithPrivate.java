package unit4;
class A1 {
        int i;

        }
class  B1 extends A1 {
    int j;
    void display(){
        System.out.println("The values are "+i+" " +j);
    }
}
public class inheritwithPrivate {

    public static void main(String[] args) {


        A1 obj1 = new A1();
        B1 obj2 = new B1();

        obj2.i = 10;
        obj2.j=20;
        obj2.display();

    }
}
