package FileIo;

import java.io.File;
import java.io.FileOutputStream;

public class FileOStreamSinifi {
    public static void main(String[] args) {
        String c = "deneme13213";
        try{
            FileOutputStream a = new FileOutputStream("deneme14.txt",true);//true gönderdiğimizde üstüne yazmaz olana ekleme yapar.
            byte[] dizi = c.getBytes();//Stringi byte çevirmemiz gerek ekleme yapmak için
            a.write(dizi);//a ya dizi ekler
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
