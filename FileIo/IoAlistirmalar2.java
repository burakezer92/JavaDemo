package FileIo;

import java.io.FileOutputStream;

public class IoAlistirmalar2 {
    public static void main(String[] args) {
        String b = "eklenen veri2";
        try{
            FileOutputStream a = new FileOutputStream("src/FileIo/IoAlistir2.txt",true);
            byte[] c = b.getBytes();
            a.write(c);
            a.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
