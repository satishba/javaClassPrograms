package threads;





class testThread4 implements Runnable {
    Thread t;
    String name;

    testThread4(String threadName) {
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
public class threadJoin {

    public static void main(String[] args) {
        testThread4 th1 = new testThread4("one");
        testThread4 th2 = new testThread4("two");
        testThread4 th3 = new testThread4("three");
        th1.t.start();
        th2.t.start();
        th3.t.start();

        for(int i=0;i<5;i++){
            System.out.println("main thread" + i);
            try {
            th1.t.join();
            th2.t.join();
            th3.t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Exiting main thread");

    }
}


