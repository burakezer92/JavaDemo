import java.util.Scanner;
public class ManavUcreti {
    public static void main(String[] args) {
        int armutt,domatest,muzt,elmat,patlicant;
        float toplam,armutf=2.14f,domatesf=3.67f,muzf=0.95f,elmaf=1.11f,patlicanf=5.00f;

        Scanner meyvefiyat = new Scanner(System.in);
        System.out.println("Armut Adedi gir:");
        armutt = meyvefiyat.nextInt();
        System.out.println("Domates Adedi gir:");
        domatest = meyvefiyat.nextInt();
        System.out.println("Muz Adedi gir:");
        muzt = meyvefiyat.nextInt();
        System.out.println("Elma Adedi gir:");
        elmat = meyvefiyat.nextInt();
        System.out.println("Patlican Adedi gir:");
        patlicant = meyvefiyat.nextInt();

        toplam = armutt*armutf+elmat*elmaf+muzt*muzf+patlicant*patlicanf+domatest*domatesf;
        System.out.println("Toplam:" + toplam);
    }
}
