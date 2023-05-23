import java.util.Scanner;
public class EbobEkokJava {
    public static void main(String[] args) {
        int a1,a2;
        Scanner girdi=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        a1 = girdi.nextInt();
        System.out.print("Sayı giriniz:");
        a2 = girdi.nextInt();
        if(a1<a2){
            int i= a1;
            while(i>0){

                if ((a1%i==0)&&(a2%i==0)){
                    System.out.print("Ekok:");
                    System.out.println(i);
                    break;
                }
                i--;

            }

        }else{
            int i=a2;
            while(i>0){
                if ((a1%i==0)&&(a2%i==0)){
                    System.out.print("Ekok:");
                    System.out.println(i);
                    break;
                }
                i--;

            }
        }
        int j=1;
        while(j<=(a1*a2)){
            if ((j%a1==0)&&(j%a2==0)){
                System.out.print("Ebob:");
                System.out.println(j);

                break;
            }
            j++;

        }

    }
}
