import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int gidilenyol;
        float kmbasina=2.20f;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Gidilen KM giriniz:");
        gidilenyol = girdi.nextInt();
        double yolucreti = 10+ gidilenyol*kmbasina;
        double sonuc = yolucreti>20 ? yolucreti : 20;
        System.out.print("Ücret:"+ sonuc);
    }
}
