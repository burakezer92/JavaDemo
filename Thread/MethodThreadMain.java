package Thread;

public class MethodThreadMain {
    public static void main(String[] args) {
        MethodRunable mr1 = new MethodRunable("c1");
        MethodRunable mr2 = new MethodRunable("c2");
        MethodRunable mr3 = new MethodRunable("c3");
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr2);
        Thread t3 = new Thread(mr3);//interfaceden impliment ederek kalıtım hakkımızı doldurmuyoruz.kalıtımla yaparsak tek ata sınıfımız olması gerektiğinden ata sınıf hakkımız kalmaz
        t1.start();
        t2.start();
        t3.start();
    }
}
