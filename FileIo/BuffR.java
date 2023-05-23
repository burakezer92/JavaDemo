package FileIo;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuffR {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src/FileIo/filereader.txt");
            BufferedReader br = new BufferedReader(fr);
            String a = br.readLine();
            while(a!=null){
                System.out.println(a);
                a = br.readLine();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
