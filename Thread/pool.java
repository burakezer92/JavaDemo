package Thread;

public class pool implements Runnable{
    private int sirano;
    private final Object LOCK = new Object();//Threadler birbirlerinin hakkını almamak için tanımlanmalı
    public pool(){
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

        siralama();


    }
    public synchronized void siralama(){
        this.sirano++;
        System.out.println(Thread.currentThread().getName() + "\t" + this.sirano);
    }
}
