import java.util.Scanner;

public class RecursiveAsalJava {
    static int asal(int a,int i){
        if(i==1)
            return 1;
        if (a%i==0)
            return 0;
        return asal(a,i-1);
    }
    public static void main(String[] args) {
        int a,b;
        System.out.print("Sayı giriniz:");
        Scanner girdi = new Scanner(System.in);
        a = girdi.nextInt();
        for (int j=2;j<=a;j++){
            b = asal(j,j/2);
            if(b==1){
                System.out.println(j);
            }
        }


    }
}
