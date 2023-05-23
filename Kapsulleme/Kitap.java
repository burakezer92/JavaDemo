package Kapsulleme;

public class Kitap {
    public String kitapIsmi;
    private int sayfaSayisi;
    Kitap(String kitapIsmi,int sayfaSayisi){
        this.kitapIsmi= kitapIsmi;
        if(sayfaSayisi<0){
            sayfaSayisi=0;
        }
        this.sayfaSayisi=sayfaSayisi;
    }
    public int getsayfaSayisiGoster(){
        return this.sayfaSayisi;
    }
    public void setsayfaSayisiDegis(int a){
        if(a<0){
            a=0;
        }
        this.sayfaSayisi=a;
    }

}
