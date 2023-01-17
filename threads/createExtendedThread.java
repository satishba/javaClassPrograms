package threads;

class testThread1 extends Thread {
    Thread t;

    testThread1() {
super("test Thread");
System.out.println("Thread create");
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("child" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting child thread");

    }
}
public class createExtendedThread {

    public static void main(String[] args) {
        testThread1 th = new testThread1();
        th.start();

        for(int i=0;i<5;i++){
            System.out.println("main thread" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting main thread");

    }
}



