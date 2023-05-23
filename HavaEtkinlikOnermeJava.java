import java.util.Scanner;
public class HavaEtkinlikOnermeJava {
    public static void main(String[] args) {
        int sicaklik;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Kaç derece:");
        sicaklik = girdi.nextInt();
        if (sicaklik<5)
            System.out.println("Kayak");
        else if (sicaklik<15)
            System.out.println("Sinema");
        else if (sicaklik<25)
            System.out.println("Yüzme");
        else
            System.out.println("Piknik");
    }
}
