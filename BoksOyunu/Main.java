package BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Boksor b1 = new Boksor("Muhammed Ali",10,130,100,50);
        Boksor b2 = new Boksor("Mike Tyson",10,130,100,50);
        Boksor b3 = new Boksor();
        b3.isim="deneme";
        b3.can=0;
        b3.hasar=0;
        b3.siklet=0;
        Musabaka karsilasma = new Musabaka(b1,b2,80,150);
        karsilasma.baslama();
    }

}
