package HataKontrol;

public class HataKontrolTry {
    static void hatabul(int a,int b){
        try{
            System.out.println(a/b);
        }catch (ArithmeticException c){
            System.out.println("Arit hata işlem");
        }catch (Exception e){
            System.out.println("Hatalı işlem");
        }finally {
            System.out.println("hep çalışır");
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b =0;
        hatabul(a,b);
    }


}
