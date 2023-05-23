package Giris;
import java.util.Scanner;

public class BaslangicPratik {
    public static void main(String[] args) {
        int turkce, matematik, fizik, kimya, biyoloji;
        float ort;

        Scanner girilennot = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        matematik = girilennot.nextInt();

        System.out.print("Türkçe notunu giriniz:");
        turkce = girilennot.nextInt();

        System.out.print("Kimya notunu giriniz:");
        kimya = girilennot.nextInt();

        System.out.print("Biyoloji notunu giriniz:");
        biyoloji = girilennot.nextInt();

        System.out.print("Fizik notunu giriniz:");
        fizik = girilennot.nextInt();

        ort = (matematik+turkce+kimya+fizik+biyoloji)/5;
        System.out.println("not ortalaması:"+ ort);

        String durum = ort>60 ? "Geçti" : "Kaldı";
        System.out.print("Durumu:"+ durum);





    }


}
