import java.util.Scanner;
public class EnKucukEnBuyukJava {
    public static void main(String[] args) {
        int a,sayac=1;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayı Gir:");
        a = girdi.nextInt();
        int EnBuyuk=a,EnKucuk=a;
        while(sayac<10){
            System.out.print("Sayı Gir:");
            a = girdi.nextInt();
            if(a>EnBuyuk){
                EnBuyuk=a;
            }
            if(a<EnKucuk){
                EnKucuk=a;
            }
            sayac ++;
        }
        System.out.print("En büyük:"+ EnBuyuk);
        System.out.print("En küçük:"+ EnKucuk);
    }
}
