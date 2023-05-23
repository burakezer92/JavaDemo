package PaketLambda;

public class SinifLambda {
    public static void main(String[] args) {
        InterLambda a = new InterLambda() {//Tip1
            @Override
            public int islem(int b,int c) {
                return b+c;
            }
        };//Tip1son
        System.out.println(a.islem(10,20));

        InterLambda z = (d, e) -> d+e;//Tip2  tek satırda return yazılmaz gerek yok
        System.out.println(z.islem(15,65));
        //Tip1 ve tip2 aynı grevi görüyorlar
        //Lambda kullanılabilmesi için fonksiyonel interface olmalı
        InterLambda u = (d, e) -> {
            System.out.println("deneme");
            return d+e;
        };//süslü parantezle yazılıp birden fazla satır varsa return yazılmalı
        System.out.println(u.islem(89,71));


    }
}
