public class TipDonusumleri {
    public static void main(String[] args) {
        int a = 10;
        double b = a;//Küçük değere büyük değere otomati dönüşür.
        System.out.println(b);
        double c = 105.69;
        int d = (int) c;//büyük değer küçük değere zorlayarak manuel şekilde dönüştürülür.
        System.out.println(d);
        int e = 50;
        String f = String.valueOf(e);//Stringe çevirme fonksiyonu
        System.out.println(f);
        Integer g = Integer.parseInt(f);//integer çevirirken wrapper değişken kullanmalıyız method kullanmak için.
        System.out.println(g);
    }
}
