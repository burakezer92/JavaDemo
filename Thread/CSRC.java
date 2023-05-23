package Thread;

public class CSRC implements Runnable{

    private int sirano;
    private final Object LOCK = new Object();//Threadler birbirlerinin hakkını almamak için tanımlanmalı
    public CSRC(){
        this.sirano=0;
    }
    public int getSirano(){
        return this.sirano;
    }
    public void setSirano(int a){
        this.sirano=a;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        /*
        synchronized (LOCK){//Threadler birbirlerinin hakkını almamak için tanımlanmalı, Sıradaki tread diğer threadlere yer varmemek için bu tanımlanır
            this.sirano++;
            System.out.println(Thread.currentThread().getName() + "\t" + this.sirano);
        }

         */
        siralama();


    }
    public synchronized void siralama(){// synchronized (LOCK) methoduyla aynı işi yapan method biz oluşturduk
        this.sirano++;
        System.out.println(Thread.currentThread().getName() + "\t" + this.sirano);
    }
}
