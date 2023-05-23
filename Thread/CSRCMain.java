package Thread;

import java.util.ArrayList;
import java.util.List;

public class CSRCMain {
    public static void main(String[] args) throws InterruptedException{
        CSRC csrc1 = new CSRC();

        /*
        Thread t1 = new Thread(csrc1);
        t1.start();
        t1.join();//thread(iş kuruğu) birbirlerini beklemesi için tarafik polisi görevi görür. ör Sıramatikte aynı değer iki threadde alınamaz.bunu önler.threadlerinbirbirlerini bklemesini sağlar.
        Thread t2 = new Thread(csrc1);
        t2.start();
        t2.join();
         */
        List<Thread> islemler = new ArrayList<>();
        for(int i=0;i<100;i++){
            Thread t2 = new Thread(csrc1);
            islemler.add(t2);
            t2.start();
        }
        Thread.sleep(5000);
        System.out.println(csrc1.getSirano());
    }

}
