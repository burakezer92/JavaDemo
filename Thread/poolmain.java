package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class poolmain {
    public static void main(String[] args) throws InterruptedException{
        pool pool1 = new pool();
        ExecutorService pool = Executors.newFixedThreadPool(10);//Thread maliyetli olduğundan thread havuzu oluşturup 10 tane thread içine atıyoruz.Döne döne çalışıyor onlar.
        for(int i=0;i<100;i++){
            pool.execute(pool1);
        }
        Thread.sleep(5000);
        System.out.println(pool1.getSirano());
    }
}
