package FileIo.BuffIOStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BuffI {
    public static void main(String[] args) {
        try {
            File f2 = new File("src/FileIo/BuffIOStream/buffi.txt");
            f2.createNewFile();
            FileInputStream f1 = new FileInputStream("src/FileIo/BuffIOStream/buffi.txt");
            BufferedInputStream bi1 = new BufferedInputStream(f1);
            int i = bi1.read();
            while(i!=-1){
                System.out.print((char) i);
                i = bi1.read();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
