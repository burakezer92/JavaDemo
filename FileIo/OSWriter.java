package FileIo;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OSWriter {
    public static void main(String[] args) {
        String b="OSWriter2";
        try{
            FileOutputStream f1 = new FileOutputStream("OSWriter.txt");
            OutputStreamWriter osw1 = new OutputStreamWriter(f1);//çevirmeden gertürlü tipi ekleyebiliriz txt dosyasına
            osw1.write(b);
            osw1.close();
            f1.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
