import java.util.*;
public class KucuktenBuyuge {
    public static void main(String[] args) {
        int a,b,c;
        Scanner girdi = new Scanner(System.in);
        System.out.print("a. sayıyı giriniz:");
        a = girdi.nextInt();
        System.out.print("b. sayıyı giriniz:");
        b = girdi.nextInt();
        System.out.print("c. sayıyı giriniz:");
        c = girdi.nextInt();
        if (a<b&&a<c){
            int z = (b<c ? 1 : 2);
            switch (z){
                case 1:
                    System.out.println("a<b<c");
                    break;
                case 2:
                    System.out.println("a<c<b");
                    break;
            }

        }
        else if (b<a&&b<c){
            int z = (a<c ? 1 : 2);
            switch (z){
                case 1:
                    System.out.println("b<a<c");
                    break;
                case 2:
                    System.out.println("b<c<a");
                    break;
            }

        }
        else{
            int z = (b<a ? 1 : 2);
            switch (z){
                case 1:
                    System.out.println("c<b<a");
                    break;
                case 2:
                    System.out.println("c<b<a");
                    break;
            }
        }
    }
}
