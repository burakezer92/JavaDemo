public class Matris {
    public static void main(String[] args) {
        int[][] dizi = new int[3][5];
        int dizi3[][] =new int[2][3];
        int[][] dizi2 = new int[][]{{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(dizi2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
