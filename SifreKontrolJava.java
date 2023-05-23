import java.util.Scanner;
public class SifreKontrolJava {
    public static void main(String[] args) {
        String kullaniciadi="patika",kullaniciadi2,sifre="patika123",sifre2,sifre3;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kullanıcı adı:");
        kullaniciadi2 = girdi.nextLine();
        System.out.print("Şifre:");
        sifre2 = girdi.nextLine();
        if (kullaniciadi.equals(kullaniciadi2)&&sifre.equals(sifre2)){
            System.out.println("Giriş Başarılı");
        }else{
            System.out.print("Bilgiler hatalı Şifre değiştirmek için 1'e çıkmak için 2'ye basınız");
            int a = girdi.nextInt();
            switch (a){
                case 1:
                    System.out.print("Eski şifrenizi giriniz.");
                    Scanner girdi2 = new Scanner(System.in);
                    sifre3 = girdi2.nextLine();
                        if(sifre.equals(sifre3)){
                        System.out.println("Yeni Şifrenizi girebilirsiniz:");
                        sifre = girdi2.nextLine();
                         }else {
                        System.out.println("Eski şifre hatalı");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış Yapıldı");
                    break;


            }
        }
        System.out.println(kullaniciadi);
        System.out.println(sifre);
    }
}
