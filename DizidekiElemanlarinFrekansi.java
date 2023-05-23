import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlarinFrekansi {

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
        System.out.println(Arrays.toString(a));
        int sayac2=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j])
                    sayac2++;
            }


                    System.out.print(a[i]);
                    System.out.print("=>");
                    System.out.print(sayac2);
                    System.out.println();
                    sayac2=0;





        }


    }
}
