package FileIo.Fwreader;

import java.io.FileReader;

public class Freader {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("src/FileIo/filereader.txt");//Inputreade aynısı daha kısa yazımı
            int i=fr.read();
            while(i!=-1){
                System.out.print((char)i);
                i=fr.read();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
