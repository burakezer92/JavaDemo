public class PalindromJava {
    static boolean isPalindrom(int a){
        int temp=a,sonBasamak,sonSayi=0;
        while(temp!=0){
            sonBasamak = temp%10;
            sonSayi = (sonSayi*10)+sonBasamak;
            temp /= 10;
        }
        if(sonSayi==a)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(47874));
    }
}
