
public class UsluRecursive {
    static int UsluSayilar(int a,int b){
        if(b==1){
            return a;
        }
        return UsluSayilar(a,b-1)*a;
    }    public static void main(String[] args) {
        System.out.println(UsluSayilar(2,6));
    }
}
