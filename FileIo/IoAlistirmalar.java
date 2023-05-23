package FileIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IoAlistirmalar {
    public static void main(String[] args){
        try{
            File c = new File("src");
            File b = new File("src/FileIo/IoAlistir.txt");
            b.createNewFile();
            FileInputStream a = new FileInputStream("src/FileIo/IoAlistir.txt");
            System.out.println(a.available());
            int i =a.read();
            while (i!=-1){
                System.out.print((char)i);
                i = a.read();
            }
            String[] dizi = c.list();
            for (String m : dizi){
                System.out.println(m);
            }

            a.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
