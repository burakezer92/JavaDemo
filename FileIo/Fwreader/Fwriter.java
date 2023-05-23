package FileIo.Fwreader;

import java.io.FileWriter;

public class Fwriter {
    public static void main(String[] args) {
        String a = "Fwriter";
        try{
            FileWriter fw = new FileWriter("src/FileIo/fileWriter.txt");
            fw.write(a);
            fw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
