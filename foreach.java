public class foreach {
    public static void main(String[] args) {
        int[] dizi = new int[]{1,2,3,4};
        for (int i:dizi){
            //System.out.println(i);
        }
        int[][] dizi2 = new int[5][10];
        int k=1;
        for(int i=0;i<dizi2.length;i++){
            for (int j=0;j<dizi2[0].length;j++){
                dizi2[i][j]=k;
                k ++;
            }
        }
        System.out.println("dizi2.length");
        System.out.println(dizi2.length);
        System.out.println(dizi2[0].length);
        for(int[] sutun:dizi2){
            for (int i:sutun){
                System.out.print(i+"\t");
            }
            System.out.println();
        }


    }
}
