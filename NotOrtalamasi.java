import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,fiz,kim,muz,tur,bolum=0;
        double avg=0,avgs=0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Türkçe Notu:");
        tur = girdi.nextInt();
        System.out.print("Matematik Notu:");
        mat = girdi.nextInt();
        System.out.print("Fizik Notu:");
        fiz = girdi.nextInt();
        System.out.print("Kimya Notu:");
        kim = girdi.nextInt();
        System.out.print("Müzik Notu:");
        muz = girdi.nextInt();
        if(0<=mat&&mat<=100) {
            avg += mat;
            bolum++;
        }
        if(0<=fiz&&fiz<=100) {
            avg += fiz;
            bolum++;
        }
        if(0<=kim&&kim<=100) {
            avg += kim;
            bolum++;
        }
        if(0<=muz&&muz<=100) {
            avg += muz;
            bolum++;
        }
        if(0<=tur&&tur<=100) {
            avg += tur;
            bolum++;
        }
        avgs = avg/bolum;
        if (avg>55){
            System.out.println("Geçtiniz");
        }
        else{
            System.out.println("kaldınız");
        }
        System.out.println("Not Ort:"+avgs);

    }
    }

