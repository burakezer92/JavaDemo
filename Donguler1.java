import java.util.Scanner;
public class Donguler1 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a,b=1,toplam=0,d=0;
        System.out.print("Bir sayı giriniz:");
        a = girdi.nextInt();
        while(b<=a){
            if ((b%3==0)&&(b%4==0)){
                d++;
                toplam += b;
            }
            b++;
        }
        System.out.println("ortalaması:"+toplam/d);
        System.out.println("toplamı:"+toplam);
        System.out.println("adet:"+d);
    }
}
