package FileIo.BuffIOStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffO {
    public static void main(String[] args) {
        String a1="deneme123";
        try {
            FileOutputStream bo1 = new FileOutputStream("src/FileIo/BuffIOStream/buffo.txt",true);
            BufferedOutputStream bo2 = new BufferedOutputStream(bo1);
            byte[] by1 = a1.getBytes();
            bo2.write(by1);
            bo2.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
