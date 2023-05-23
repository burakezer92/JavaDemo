import java.util.Scanner;
public class Donguler2 {
    public static void main(String[] args) {
        int a,toplam=0;
        Scanner girdi = new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz:");
            a = girdi.nextInt();
            if((a%2==0)&&(a%4==0)){
                toplam += a;
            }
        }while (a%2!=1);
        System.out.print("Toplam:" + toplam);
    }
}
