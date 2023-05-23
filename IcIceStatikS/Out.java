package IcIceStatikS;

public class Out {
    public static int a=10;
    public static class In{
        public static int a=1;
        public static void run(){
            int a=2;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.a);
        }
    }
    public void run(){
        In.run();
    }
    public void Yerel(){
        class YerelS{
            private int a=70;
            YerelS(int a){
                this.a=a;
            }
            public int getA(){
                return this.a;
            }
            public void setA(int a){
                this.a=a;
            }

        }
        YerelS yerelsinif = new YerelS(23);
        System.out.println(yerelsinif.getA());
    }

    //YerelS yerelsinif = new YerelS(23); Yerel sınıf olduğu için method dışında nesne üretilmez.Çalışmaz.
}
