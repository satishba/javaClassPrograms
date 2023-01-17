package threads;


class printstr{
     synchronized void printing(String msg){
    System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    System.out.println("]");
    }

}
class callprint implements  Runnable {
    String msg;
    printstr printmsg;
    Thread t;

    public callprint(printstr printcall,String s){
        printmsg = printcall;
        msg = s;
        t = new Thread(this);
    }
    public void run() {

        printmsg.printing(msg);
    }
}
public class threadSynchronization {
    public static void main(String[] args) {


        printstr sendprint = new printstr();
        callprint t1 = new callprint(sendprint, "Hello");
        callprint t2 = new callprint(sendprint, "new");
        callprint t3 = new callprint(sendprint, "thread");
        t1.t.start();
        t2.t.start();
        t3.t.start();

        try {
            t1.t.join();
        t2.t.join();
        t3.t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}