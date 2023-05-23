import java.util.Scanner;
public class AtmJava {
    public static void main(String[] args) {
        double bakiye = 10000;
        byte girishak=3;
        Scanner girdi = new Scanner(System.in);
        byte secenek;
        do {
            System.out.println("1-Para Yatır\n2-Para Çek\n3-Bakiye Sorgulama\n4-Çıkış");
            secenek = girdi.nextByte();
            switch (secenek){
                case 1:
                    System.out.println("Bakiye:"+bakiye);
                    System.out.print("Yatırılacak miktar:");
                    bakiye += girdi.nextDouble();
                    System.out.println("Bakiye:"+bakiye);
                    break;
                case 2:
                    System.out.println("Bakiye:"+bakiye);
                    System.out.print("Çekilecek miktar:");
                    double a = girdi.nextDouble();
                    if(a<=bakiye){
                        bakiye -= a;
                        System.out.println("Bakiye:"+bakiye);
                    }else{
                        System.out.println("Bakiye yetersiz");
                        System.out.println("Bakiye:"+bakiye);
                        break;

            }
                case 3:
                    System.out.println("Bakiye:"+bakiye);
                    break;
                case 4:
                    break;

                }


            }while(secenek!=4);



    }}

