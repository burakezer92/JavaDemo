import java.util.Scanner;
public class DaireAciAlani {
    public static void main(String[] args) {
        int aci,r;
        float pi = 3.14f;
        Scanner girdisinifi = new Scanner(System.in);
        System.out.print("Daire yarıçapını giriniz:");
        r = girdisinifi.nextInt();
        System.out.print("Daire açısı giriniz:");
        aci = girdisinifi.nextInt();
        System.out.println("Daire'nin alanı:" + (pi*(r*r)));
        System.out.println("Daire'nin açısal alanı:" + (pi*(r*r)*aci)/360);
        System.out.println("Daire'nin çevresi:" + (pi*r*2));



    }
}
