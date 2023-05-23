package FileIo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PWriter {
    public static void main(String[] args) {
        String a ="sadasda";

        try {
            PrintWriter pw = new PrintWriter("src/FileIo/pstream2.txt");
            pw.print(2131231231);//herşeyi stringe çevirerek atar
            pw.print(a);
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
