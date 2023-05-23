import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int basamakSayisi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        basamakSayisi = girdi.nextInt();
        for(int satirs=1;satirs<=basamakSayisi;satirs++){
            for(int bosluk=1;bosluk<=satirs;bosluk++){
                System.out.print(" ");
            }
            for (int yildiz=basamakSayisi+1;yildiz>=(2*satirs)-1;yildiz--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
