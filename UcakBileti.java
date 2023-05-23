import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int yas=1,tip=1,mesafe;
        double ucret=0,kmpara=0.10;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Yaş:");
        yas = girdi.nextInt();
        System.out.print("Mesafe:");
        mesafe = girdi.nextInt();
        System.out.print("Tip:");
        tip = girdi.nextInt();
        if(yas>0&&mesafe>0&&(tip==1||tip==2)){
            if(yas<12){
                ucret = mesafe*kmpara*0.50;
                if (tip==2){
                    ucret = ucret*2*0.80;
                }
            }else if(yas<24){
                ucret = mesafe*kmpara*0.90;
                if (tip==2){
                    ucret = ucret*2*0.80;
                }
            }else if(yas>65){
                ucret = mesafe*kmpara*0.70;
                if (tip==2){
                    ucret = ucret*2*0.80;
                }
            }else {
                ucret = mesafe*kmpara;
                if (tip==2){
                    ucret = ucret*2*0.80;
                }
            }
            System.out.println("Ucret:" + ucret);
        }else{
            System.out.println("hatalı seçim yaptınız");
        }
    }
}
