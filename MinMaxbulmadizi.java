public class MinMaxbulmadizi {
    public static void main(String[] args) {
        int[] dizi={15,12,788,1,-1,-778,2,0};
        int min=dizi[0];
        int max=dizi[0];
        for(int i:dizi){
            if (i<min){
                min=i;
            }
            if (i>max){
                max= i;
            }
        }
        System.out.println("max:"+max);
        System.out.print("min"+min);
    }

}
