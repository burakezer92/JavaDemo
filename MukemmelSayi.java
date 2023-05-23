import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int a,toplam=0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        a = girdi.nextInt();
        for(int i=1;i<a;i++){
            if(a%i==0){
                toplam += i;
            }
        }
        System.out.println(toplam);
        System.out.println(a);
        if(toplam==a){
            System.out.println("Mükemmel Sayı");
        }else{
            System.out.println("Mükemmel sayı değil");
        }
    }

}
