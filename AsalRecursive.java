public class AsalRecursive {
static int isAsal(int a){
    if(a<3){
        return -1;
    }
    if(a%isAsal(a-1)==0){
        return -2;
    }
    return isAsal(a-1);
}
    public static void main(String[] args) {

    }
}
