package FileIo;

import java.io.File;
import java.io.FileInputStream;

public class FileIStreamSinifi {
    public static void main(String[] args){
        try{
            File b = new File("patika3.txt");
            b.createNewFile();//olmayan dosya oluşturur.
            FileInputStream a = new FileInputStream(b);
            a.skip(1);//n kadar haneyi atlar başlar
            int i = a.read();
            System.out.print(a.available());//kaç karakter var

            while(i!=-1){//-1 olunca bitiyor alacak veri kalmıyor
                System.out.print((char) i);//char çevirme
                i = a.read();//read methodu değeri basıp bir sonrakine geçer itr benzer


            }
            a.close();//kapatmaya yarar.
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
