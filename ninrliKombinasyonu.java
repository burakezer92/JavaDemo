import java.util.Scanner;
public class ninrliKombinasyonu {
    public static void main(String[] args) {
        int n,r,nfakt=1,rfakt=1,mfakt=1;
        Scanner girdi = new Scanner(System.in);
        System.out.println("N sayısını giriniz:");
        n = girdi.nextInt();
        System.out.println("R sayısını giriniz:");
        r = girdi.nextInt();
        for (int i=1;i<=n;i++){
            nfakt *= i;
        }
        for (int j=1;j<=r;j++){
            rfakt *= j;
        }
        int m = n-r;
        for (int k=1;k<=m;k++){
            mfakt *= k;
        }

        System.out.println(nfakt/(rfakt*mfakt));

    }
}
