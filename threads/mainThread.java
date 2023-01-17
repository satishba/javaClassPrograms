package threads;

public class mainThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("current thread "+t.getName());
        t.setName("Hello");
        System.out.println("new name "+t.getName());
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
