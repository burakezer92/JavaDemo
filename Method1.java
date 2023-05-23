import java.util.Scanner;
public class Method1 {
    static void ekrana(){
        System.out.println("denmee");
    }
     static int fonksiyon(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a = 5;
        int b=9;
        System.out.println(fonksiyon(a,b));
        ekrana();
    }
}
