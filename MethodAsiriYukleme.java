public class MethodAsiriYukleme {
    static int method1(int a){
        System.out.println("method1 göster");
        return 1;
    }
    static void method1(){
        System.out.println("method1 2.göster");
    }
    static int method1(int a,int b){
        System.out.println("method1 3.göster");
        return a+b;
    }
    public static void main(String[] args) {
        method1();
        method1(1);
        method1(1,2);
        System.out.println(method1(1,2));
    }
}
