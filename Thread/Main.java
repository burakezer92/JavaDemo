package Thread;

public class Main {
    public static void main(String[] args) {
        MethodThread m1 = new MethodThread("1. Method ");
        MethodThread m2 = new MethodThread("2. Method ");//Threadler işlemleri aynı anda yapmaya yarar
        m1.start();
        m2.start();
    }
}
