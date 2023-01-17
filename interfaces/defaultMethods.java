package interfaces;

interface deftMethods {
    void disp();
     default void show() {
        System.out.println("This is the default message");
    }
}
public class defaultMethods implements deftMethods {
    public void disp() {
        System.out.println("Implementation of disp");
    }
    public void show() {
        System.out.println("New implementation");
    }
}
