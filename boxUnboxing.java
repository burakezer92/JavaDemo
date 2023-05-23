public class boxUnboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;//Auto boxing
        Integer c = Integer.valueOf(a);//boxing
        int d = b;//Auto unboxing
        int e = b.intValue();
        //İlkel veri tipleri ve Wrapper sınıfları birbirine çevirir.



    }
}
