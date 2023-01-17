package unit4;
class A {
    int i;

}
class  B extends A {
    int j;
    void display(){
        System.out.println("The values are "+i+" " +j);
    }
}
public class inheritBasic {
    public static void main(String[] args) {


        A obj1 = new A();
        B obj2 = new B();

        obj2.i = 10;
        obj2.j=20;
        obj2.display();

    }
}
