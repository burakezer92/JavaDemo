import java.util.Scanner;
public class BurcJava {
    public static void main(String[] args) {
        int ay,gun;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Ay:");
        ay = girdi.nextInt();
        System.out.print("Gun:");
        gun = girdi.nextInt();
        if((ay==1&&gun<22)||(ay==12&&gun>23)){
            System.out.println("Oğlak Burcu");
        }if((ay==2&&gun<20)||(ay==1&&gun>23)){
            System.out.println("Kova Burcu");
        }if((ay==3&&gun<21)||(ay==2&&gun>21)){
            System.out.println("Balık Burcu");
        }if((ay==4&&gun<21)||(ay==3&&gun>22)){
            System.out.println("Koç Burcu");
        }if((ay==5&&gun<22)||(ay==4&&gun>22)){
            System.out.println("Boğa Burcu");
        }if((ay==6&&gun<23)||(ay==5&&gun>23)){
            System.out.println("İkizler Burcu");
        }if((ay==7&&gun<23)||(ay==6&&gun>24)){
            System.out.println("Yengeç Burcu");
        }if((ay==8&&gun<23)||(ay==7&&gun>24)){
            System.out.println("Aslan Burcu");
        }if((ay==9&&gun<23)||(ay==8&&gun>24)){
            System.out.println("Başak Burcu");
        }if((ay==10&&gun<24)||(ay==9&&gun>23)){
            System.out.println("Terazi Burcu");
        }if((ay==11&&gun<22)||(ay==10&&gun>23)){
            System.out.println("Akrep Burcu");
        }if((ay==12&&gun<22)||(ay==11&&gun>23)){
            System.out.println("Yay Burcu");
        }
    }
}
