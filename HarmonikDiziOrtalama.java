public class HarmonikDiziOrtalama {
    public static void main(String[] args) {
        int[] dizi ={1,2,3,4,5,6};
        double sum = 0,a=1;
        for(int i=0;i<dizi.length;i++){
            sum += (a/dizi[i]);
        }
        System.out.println(sum/dizi.length);
    }

}
