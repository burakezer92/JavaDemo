public class Ozyinelemeli {
    static int metod(int n){

        if(n==1){
            return 1;
        }
        return metod(n-1)+1;
    }

    public static void main(String[] args) {
        System.out.println(metod(3));
    }
}
