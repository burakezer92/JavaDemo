import java.util.Scanner;
public class ForUsluSayilar {
    public static void main(String[] args) {
        int a,b;
        int toplam=1;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        a = girdi.nextInt();
        System.out.print("Üs Giriniz:");
        b = girdi.nextInt();
        for(int i=1;i<=b;i++){
            toplam *= a;
        }
        System.out.print(toplam);
    }
}
