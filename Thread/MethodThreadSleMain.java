package Thread;

public class MethodThreadSleMain {
    public static void main(String[] args) throws InterruptedException {
        MethodThreadSle mts1 = new MethodThreadSle("c1",1000);
        MethodThreadSle mts2 = new MethodThreadSle("c2",2000);
        Thread t1 = new Thread(mts1);
        Thread t2 = new Thread(mts2);
        t1.start();
        Thread.sleep(3000);
        mts1.durdurmethod();


        t2.start();
    }
 }
