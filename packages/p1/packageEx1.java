package packages.p1;

public class packageEx1 {
    int x1 = 10;
    private int x2 = 30;
    protected int x3 = 50;
    public int x4 = 40;

    public packageEx1() {
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
        System.out.println("x4 = " + x4);    }
}
class derived extends packageEx1 {
    derived(){
        System.out.println("x1 = " + x1);
    //   System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
        System.out.println("x4 = " + x4);
    }

}
class anotherClass{

    anotherClass() {
        packageEx1 p1 = new packageEx1();
        System.out.println("x1 = " + p1.x1);
       //System.out.println("x2 = " + p1.x2);
        System.out.println("x3 = " + p1.x3);
        System.out.println("x4 = " + p1.x4);
    }

}

