package FileIo.Seriali;

import java.io.Serializable;

public class Car implements Serializable {
    private String Marka;
    private String Model;
    Car(String a,String b){
        this.Marka=a;
        this.Model=b;
    }
    public String getMarka(){
        return this.Marka;
    }
    public String getModel(){
        return this.Model;
    }
    public void setMarka(String c){
        this.Marka=c;
    }
    public void setModel(String d){
        this.Model=d;
    }

}
