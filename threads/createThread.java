package threads;

class testThread implements Runnable {
    Thread t;

    testThread() {
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
  public  class createThread{

            public static void main(String[] args) {
                testThread th = new testThread();
                th.t.start();

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


