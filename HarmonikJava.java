import java.util.Scanner;
public class HarmonikJava {
    public static void main(String[] args) {
        int a;
        double toplam=0;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir Sayı giriniz:");
        a = girdi.nextInt();
        for(double i=1;i<=a;i++){
            toplam += (1/i);
        }
        System.out.println(toplam);
    }
}
