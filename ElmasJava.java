import java.util.Scanner;
public class ElmasJava {
    public static void main(String[] args) {
        int satirs, yildizs, bosluks;
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz:");
        satirs = input.nextInt();

        for (int i = 1; i <= satirs; i++) {

            for (int j=1;j<=satirs-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = satirs; i >= 1; i--) {

            for (int j=1;j<=satirs-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }}