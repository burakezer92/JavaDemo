import java.util.Arrays;

public class TekrarEdewnCiftSayilar {
    static boolean kontrol(int[] dizi2,int deger){
        for(int i:dizi2){
            if(i==deger){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] dizi = {2,67,4,5,3,2,9,7,6,6,4,34,89,67,4};
        int[] tempdizi = new int[dizi.length];
        int sayac = 0;
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi.length;j++){
                if((i!=j)&&dizi[i]==dizi[j]){
                    if(!kontrol(tempdizi,dizi[i])){
                        tempdizi[sayac++]=dizi[i];
                    }
                }
            }
        }
        for(int i:tempdizi){
            if(i==0){
                break;
            }else {
                if(i%2==0){
                    System.out.println(i);
                }

            }
        }

    }

}
