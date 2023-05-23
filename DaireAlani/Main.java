package DaireAlani;

public class Main {
    static {
        System.out.println("static içinde tanımlandığından dolayı çalışıyor");
    }
    public static void main(String[] args) {
        Alan daire1 =new Alan(5);
        System.out.println(daire1.AlanHesapla());
    }


}
