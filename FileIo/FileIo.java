package FileIo;

import java.io.File;
import java.io.IOException;

public class FileIo {
    public static void main(String[] args) throws IOException {
        File c = new File("klasor");
        c.mkdir();//klasör oluşturuyor

        File g= new File("klasor4/deneme.txt");
        g.mkdirs();//klasör oluşturup içine dosyayı atıyor

        File a = new File("klasor/deneme.txt");

        File d = new File("deneme.txt");
        try{
            if(a.createNewFile()){
                System.out.println(a.getName() + " dosyası oluşturuldu");
            }
            else{
                System.out.println(a.getName() + " dosya oluşturulamadı");
            }
        }catch (Exception b){
            System.out.println(b.getMessage());
        }
        //a.delete();//dosya silme
        //d.delete();//dosya silme
        //g.delete();
        //c.delete();
        String[] y = c.list();
        for(String u:y){
            System.out.println(u);
        }


    }

}
