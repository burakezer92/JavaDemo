import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        float kilo,boy,vki;
        Scanner Sinif = new Scanner(System.in);
        System.out.print("Kilo:");
        kilo = Sinif.nextFloat();
        System.out.print("Boy:");
        boy = Sinif.nextFloat();
        vki=kilo/(boy*boy);
        System.out.println("Vücut kile endeksiniz:" + vki);

    }
}
