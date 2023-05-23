package Soyutlama;

public class Main {


    public static void main(String[] args) {
        Soyutlama a = new Soyutlama("1.kelime","2.kelime",2,"sadasd");
        SoyutlamaAtasi c = new Soyutlama("sdsfg0","sddsd",4,"dfsd");
        a.setA("tryrt");
        System.out.println(a.getA());
        System.out.println(a.getB());
        System.out.println(a.getC());

        a.deneme("bjk");
        a.deneme2();
        a.InterMethod("m");

    }
}
