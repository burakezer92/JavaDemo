import java.util.Scanner;
public class BasamakSayiToplami {
    public static void main(String[] args) {
        int a,bs=0,bst=0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir Sayı giriniz:");
        a = girdi.nextInt();
        while(a!=0){
            bst += a%10;
            a /= 10;
            bs ++;
        }
        System.out.println("Basamak Sayısı:" + bs);
        System.out.print("Basamak Sayısı Toplamı:" + bst);
    }
}
