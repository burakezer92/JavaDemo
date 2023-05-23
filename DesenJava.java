import java.util.Scanner;

public class DesenJava {

    static void metod(int b){
        int x=b;
        if(b>0){
            b=b-5;
            System.out.println(b);
            metod(b);
            while (x!=b){
                b=b+5;
                System.out.println(b);
            }
        }
    }
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a = girdi.nextInt();
        metod(a);
    }
}
