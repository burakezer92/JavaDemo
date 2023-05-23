package FileIo.Seriali;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class OSInput {
    public static void main(String[] args) {
        try {
            FileInputStream f1 = new FileInputStream("src/FileIo/Seriali/araba.txt");
            ObjectInputStream oi1 = new ObjectInputStream(f1);
            Car c2 = (Car)oi1.readObject();
            System.out.println(c2.getMarka()+"\n"+c2.getModel());
            f1.close();
            oi1.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
