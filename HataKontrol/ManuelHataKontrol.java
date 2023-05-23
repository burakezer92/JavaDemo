package HataKontrol;

import java.io.IOException;

public class ManuelHataKontrol {
    public static void kontrol(int a) throws Exception{
        if(a==0){
            throw new Exception("a 0");//hata fırlatmaya yarar
        }
        System.out.println("a 0 değil");
    }
    public static void main(String[] args) throws Exception{
        try{
            kontrol(1);
        }catch (Exception e){
            System.out.println("çalıştı");
        }



    }
}
