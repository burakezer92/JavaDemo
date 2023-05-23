import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        int a,b,c,alan;
        double u;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. kenarı giriniz:");
        a = girdi.nextInt();
        System.out.print("2. kenarı giriniz:");
        b = girdi.nextInt();
        System.out.print("3. kenarı giriniz:");
        c = girdi.nextInt();
        u = (a+b+c)/2;
        System.out.println("Üçgenin çevresi:" + 2*u);
        System.out.print("Üçgenin alanı:" + Math.sqrt(u * (u - a)* (u - b) * (u - c)));



    }
}
