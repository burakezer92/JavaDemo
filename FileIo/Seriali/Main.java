package FileIo.Seriali;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota","Corolla");
        try {//Sınıftan üretilen nesneyi txt dosyasına depolama
            File f2 = new File("src/FileIo/Seriali/araba.txt");
            FileOutputStream f1 = new FileOutputStream(f2);
            ObjectOutputStream os1 = new ObjectOutputStream(f1);
            os1.writeObject(c1);
            os1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
