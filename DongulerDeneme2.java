import java.util.Scanner;
public class DongulerDeneme2 {
    public static void main(String[] args) {
        /*
        int sifre=123,gsifre;
        Scanner girilensifre = new Scanner(System.in);
        System.out.println("şifre gir:");
        gsifre = girilensifre.nextInt();

        while(gsifre!=sifre){
            System.out.println("Hatalı Tekrar şifre gir:");
            gsifre = girilensifre.nextInt();
                    }
        System.out.println("Giriş Başarılı");

         */
        /*
        int sol=100,sag=200;
        while(++sol<--sag);
        System.out.println(sol);
        System.out.println(sag);

         */
        /*
        int password=123,ipassword;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Şifrenizi giriniz:");
            ipassword = input.nextInt();
            if(password==ipassword){
                System.out.println("Şifre doğru");
            }else{
                System.out.println("Şifre hatalı");
            }

        }while (password!=ipassword);

         */
        /*
        int i;
        for (i=1;i<11;i++){
            System.out.println(i);
        }

         */
        /*
        int a=1;
        Scanner girdi = new Scanner(System.in);

        for(boolean kosul=true;kosul;){

            if (a>0){
                System.out.println("Sayı giriniz:");
                a = girdi.nextInt();
                kosul =true;
            }else {
                System.out.println("negatif sayı girildi programdan çıkıldı");
                kosul =false;
            }
        }

         */
        int a=1;
        Scanner girdi = new Scanner(System.in);

        for(boolean kosul=true;kosul;){

            if (a>0){
                if(a==5){
                    break;
                }

                System.out.println("Sayı giriniz:");
                a = girdi.nextInt();
                kosul =true;
            }else {
                System.out.println("negatif sayı girildi programdan çıkıldı");
                kosul =false;

            }
        }






    }
}