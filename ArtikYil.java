import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Yil:");
        yil = girdi.nextInt();
        if(yil%4==0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println("artık yıldır");
                }
                else{
                    System.out.println("Artık yıl değildir.");}
            }else{
                System.out.println("Artık yıldır");}
        }else{
            System.out.println("Artık yıl değildir.");}
}}
