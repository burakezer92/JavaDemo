package Giris;
import java.util.Scanner;
public class kdvjavahesapla {
    public static void main(String[] args) {
        int fiyat;
        System.out.print("Fiyat giriniz:");
        Scanner girilenfiyat = new Scanner(System.in);
        fiyat = girilenfiyat.nextInt();
        System.out.println("Girilen KDV'siz Fiyat:" + fiyat);

        Double kdvlifiyat = fiyat>1000 ? fiyat*1.18 : fiyat*1.08;
        System.out.print("Girilen KDV'li Fiyat:" + kdvlifiyat);
    }
}
