package FileIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PStreamSinifi {
    public static void main(String[] args) {
        System.out.println("Burak Ezer");
        try {
            FileOutputStream fo = new FileOutputStream("src/FileIo/pstream.txt");
            PrintStream ps = new PrintStream(fo);
            ps.print("deneme");//daha kolay bişekilde her türdeki veriyi string yaparak dosyaya ekler
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
