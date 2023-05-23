import java.util.Scanner;
public class EnYakinBuyukVeKucukSayilar {
    public static void main(String[] args) {
        int[] dizi = {15,12,788,1,-1,-778,2,0};
        Scanner girdi = new Scanner(System.in);
        int maxyakin=dizi[0];
        int minyakin=-99999;
        int a = girdi.nextInt();
        for(int i :dizi){
            if(i>a){
                if(i<maxyakin){
                    maxyakin=i;
                }
            }
            if(i<a){
                if(i>minyakin){
                    minyakin=i;
                }
            }
        }
        System.out.println(minyakin);
        System.out.println(maxyakin);
    }


}
