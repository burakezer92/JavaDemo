package Koleksiyonlar.TreeSet;

public class Ogrenciler {
    private String OgrenciIsim;
    private int Not;

    Ogrenciler(String a,int b){
        this.OgrenciIsim=a;
        this.Not=b;
    }

    public int getNot() {
        return Not;
    }

    public void setNot(int not) {
        Not = not;
    }

    public String getOgrenciIsim() {
        return OgrenciIsim;
    }

    public void setOgrenciIsim(String ogrenciIsim) {
        OgrenciIsim = ogrenciIsim;
    }
}
