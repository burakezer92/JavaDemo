package Kapsulleme;

public class Main {
    public static void main(String[] args) {
        Kitap k1 = new Kitap("Harry Potter",-100);
        Kitap k2 = k1;
        System.out.println(k1.kitapIsmi + " " + k1.getsayfaSayisiGoster());
        k1.setsayfaSayisiDegis(-100);
        System.out.println(k1.kitapIsmi + " " + k1.getsayfaSayisiGoster());
    }
}
