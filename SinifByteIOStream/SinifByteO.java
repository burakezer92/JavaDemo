package SinifByteIOStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class SinifByteO {
    public static void main(String[] args) {
        String veri = "sdadsadasdasd";
        ByteArrayOutputStream a = new  ByteArrayOutputStream();
        byte[] b = veri.getBytes();
        try {
            a.write(b);
            System.out.println(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(a);
    }
}
