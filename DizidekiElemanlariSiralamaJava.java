import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlariSiralamaJava {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Dizi eleman sayısı giriniz:");
        int n = girdi.nextInt();
        int[] a = new int[n];
        int sayac = 0;

        while(sayac<n){
            System.out.print(sayac+1);
            System.out.print(". elamanı : ");
            a[sayac]=girdi.nextInt();
            sayac++;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
