package Anonim;

public class Main {
    public static void main(String[] args) {
        AnonimS a = new AnonimS(){
            public int a =20;
            @Override
            public void run(){

                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run methodu");
                print();
            }
            public void print(){
                System.out.println("yazdır");
            }
        };
        a.run();

    }
}
