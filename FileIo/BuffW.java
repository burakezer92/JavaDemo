package FileIo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BuffW {
    public static void main(String[] args) {
        String a = "ĞŞİÖÇÜ";
        try{
            FileWriter fw = new FileWriter("src/FileIo/filewriter2.txt");
            BufferedWriter bw = new BufferedWriter(fw);//hızlandırır
            bw.write(a);
            bw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
