package threads;





class testThread2 implements Runnable {
    Thread t;
    String name;

    testThread2(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Thread create");
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("child "  + name+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting child thread" + name);

    }
}
public class createMultipleThreads {

    public static void main(String[] args) {
        testThread2 th1 = new testThread2("one");
        testThread2 th2 = new testThread2("two");
        testThread2 th3 = new testThread2("three");
        th1.t.start();
        th2.t.start();
        th3.t.start();

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


