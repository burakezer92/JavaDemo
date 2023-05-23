import java.util.Scanner;
public class GelismisHesapMakinesi {
    static int toplama (int a,int b){
        return a+b;
    }
    static int cikarma (int a,int b){
        return a-b;
    }
    static int carpma (int a,int b){
        return a*b;
    }
    static double bolme (double a,double b){
        return a/b;
    }
    static int uslu (int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result *=a;
        }
        return result;
    }
    static double faktoriyel (int a){
        int result=1;
        for(int i=1;i<=a;i++){
            result *= i;
        }
        return result;
    }
    static int mod (int a,int b){
        return a%b;
    }
    static void dikdalancevre (int a,int b){
        System.out.println("Çevresi" + 2*(a+b));
        System.out.println("Alanı" + a*b);
    }
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a,b,secim;
        System.out.println("1\ttoplama\n2\tçıkarma\n3\tçarpma\n4\tbölme\n5\tüslü sayı\n6\tfaktoriyel\n7\tmod alma\n8\tdikdörtgen alan ve çevre hesabı\n0\tÇıkış");
        do {
            System.out.println("Seçim:");
            secim = girdi.nextInt();
            System.out.println("İlk Sayıyı giriniz:");
            a = girdi.nextInt();
    System.out.println("İkinci Sayıyı giriniz:");
    b = girdi.nextInt();



            switch (secim){
                case 1:
                    System.out.println(toplama(a,b));
                    break;
                case 2:
                    System.out.println(cikarma(a,b));
                    break;
                case 3:
                    System.out.println(carpma(a,b));
                    break;
                case 4:
                    System.out.println(bolme(a,b));
                    break;
                case 5:
                    System.out.println(uslu(a,b));
                    break;
                case 6:
                    System.out.println(faktoriyel(a));
                    break;
                case 7:
                    System.out.println(mod(a,b));
                    break;
                case 8:
                    dikdalancevre(a,b);
                    break;
                case 0:
                    System.out.println("Çıkış yaptınız");
                default:
                    System.out.println("Hatalı seçim yaptınız.");
            }
        }while (secim!=0);

    }

}
