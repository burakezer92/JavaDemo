import java.util.Scanner;
public class ArmstrongSayilar {
    public static void main(String[] args) {
        int a,bs=0,bst=0,bd=0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir Sayı giriniz:");
        a = girdi.nextInt();
        while(a!=0){
            a /= 10;
            bs ++;
        }
        while(a!=0){
            bd = a%10;
            for(int i=1;i<=bs;i++){
                bst *=bd;
            }
        }


        System.out.println("Basamak Sayısı:" + bs);
        System.out.println("Basamak Sayısı:" + bst);
    }
}
