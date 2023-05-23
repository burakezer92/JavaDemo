import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunuJava {
    public static void main(String[] args) {
        Random rastgeles = new Random();
        int a=rastgeles.nextInt(100);
        int[] dizi=new int[5];
        System.out.println(a);
        boolean kontrol=false;
        Scanner girdi = new Scanner(System.in);
        int hak=0;
        while (hak<5){
            int b= girdi.nextInt();
            dizi[hak]=b;
            if(b<0||b>99){
                System.out.println("Girdiğiniz sayı 0-100 arasında değildir.");
                continue;

            }
            if(b==a){
                System.out.println("Tebrikler cevabınız doğru.");
                System.out.println("Kazandınız.");
                kontrol = true;
                break;
            }
            if(b<a){
                System.out.println("Girilen sayı gizli sayıdan küçüktür.");
                hak++;
                System.out.println("Kalan Hakkınız : "+(5-hak));
            }
            if(b>a){
                System.out.println("Girilen sayı gizli sayıdan büyüktür."+(5-hak));
                hak++;
                System.out.println("Kalan Hakkınız : "+(5-hak));
            }

        }
        System.out.println("Girilen değerler : " + Arrays.toString(dizi));
        if(!kontrol){
            System.out.println("Oyun Bitti.Kaybettiniz.");
        }

    }


}
