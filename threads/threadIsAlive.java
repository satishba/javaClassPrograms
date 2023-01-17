package threads;



class testThread3 implements Runnable {
    Thread t;

    testThread3() {
        t = new Thread(this, "Test Thread");
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
public class threadIsAlive {
    public static void main(String[] args) {
        testThread th = new testThread();
        th.t.start();
       System.out.println("Thread is Alive "+th.t.isAlive());
        for(int i=0;i<5;i++){
            System.out.println("main thread" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread is Alive "+th.t.isAlive());

        System.out.println("Exiting main thread");

    }
}


