public class Diziler {
    public static void main(String[] args) {
        int sayilar5[]={10,11,12,13,14,15,16,17,18,19};
        int sayilar3[]=new int[]{56115,11,12,13,14,15,16,17,18,19};
        System.out.println(sayilar3[0]);
        System.out.println(sayilar5[0]);
        int[] sayilar = new int[10];
        int[] sayilar4 = new int[10];
        int sayilar2[]=new int[15];
        sayilar[0]=1;

        sayilar2[0]=2;
        System.out.println(sayilar[0]);
        System.out.println(sayilar2[0]);
        for(int i=0;i<sayilar.length;i++){
            System.out.println(sayilar[i]);
        }
        DiziYazdir(sayilar3);
        ters(sayilar3);
        System.out.println("----------------------");
        DiziYazdir(sayilar3);
        DiziYazdir(ters(sayilar3));
    }
    static void DiziYazdir(int[] girdiDizi){
        for(int i=0;i<girdiDizi.length;i++){
            System.out.println(girdiDizi[i]);
        }
    }


        static int[] ters(int [] liste){
            int[] tersliste = new int[liste.length];
            for (int i=0, j=liste.length-1;i<liste.length;i++,j--){
                tersliste[i]=liste[j];
            }
            return tersliste;
        }


}
