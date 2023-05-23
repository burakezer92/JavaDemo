import java.util.Scanner;
public class HesapMakinesiJava {
    public static void main(String[] args) {
        int n1,n2;
        char secim;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        n1 = girdi.nextInt();
        System.out.print("2. sayıyı giriniz:");
        n2 = girdi.nextInt();
        System.out.print("İşlem yapacağınız operatörü seçiniz:");
        secim = girdi.next().charAt(0);
        switch (secim){
            case '+':
                System.out.print(n1+n2);
                break;
            case '-':
                System.out.print(n1-n2);
                break;
            case '*':
                System.out.print(n1*n2);
                break;
            case '/':
                System.out.print(n1/n2);
                break;
                default:
                    System.out.print("Hatalı giriş");
        }

    }
}
