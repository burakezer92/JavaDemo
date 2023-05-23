package SinifByteIOStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class SinifByteI {
    public static void main(String[] args) {
        byte[] b = {1,2,3,4,65,43};
        ByteArrayInputStream a = new ByteArrayInputStream(b);
        System.out.println(a.available());
        int i = a.read();
        while (i!=-1){
            System.out.print(i);
            i = a.read();
        }
        try {
            a.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
