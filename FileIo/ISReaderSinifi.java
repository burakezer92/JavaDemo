package FileIo;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ISReaderSinifi {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("src/FileIo/ISReaderSinifi.txt");
            InputStreamReader isr = new InputStreamReader(fis);//karakterlerin bozuk çıkmamasını sağlar
            int i = isr.read();
            while (i!=-1){
                System.out.print((char)i);
                i = isr.read();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
