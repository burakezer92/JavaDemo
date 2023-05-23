import java.util.Scanner;
public class SayilarinKuvveti {
    public static void main(String[] args) {
        int n;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        n = girdi.nextInt();
        System.out.print("4'ün kuvvetleri:");
        for(int i=1;i<n;i*=4){
            System.out.println(i);
        }
        System.out.print("5'in kuvvetleri:");
        for(int j=1;j<n;j*=5){
            System.out.println(j);
        }
    }
}
