public class PalindromikKelime {
    public static void main(String[] args) {
        String kelime = "kavak";
        String kelime2 = "";
        for(int i=kelime.length()-1;i>=0;i--){
            kelime2 += kelime.charAt(i);
        }
        if(kelime.equals(kelime2)){
            System.out.println("Polindromik sayıdır");
        }else{
            System.out.println("Polindromik sayı değildir.");
        }
    }
}
