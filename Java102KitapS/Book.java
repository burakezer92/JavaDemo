package Java102KitapS;

public class Book {
    private String KitapIsmi;
    private int sayfaSayisi;
    private String yazarinIsmi;
    private int yayinTarihi;
    Book(String kitapIsmi,int sayfaSayisi,String yazarinIsmi,int yayinTarihi){
        this.KitapIsmi=kitapIsmi;
        this.sayfaSayisi=sayfaSayisi;
        this.yazarinIsmi=yazarinIsmi;
        this.yayinTarihi=yayinTarihi;
    }
    public String getKitapIsmi(){
        return this.KitapIsmi;
    }
    public int getSayfaSayisi(){
        return this.sayfaSayisi;
    }
    public String getYazarinIsmi(){
        return this.yazarinIsmi;
    }
    public int getYayinTarihi(){
        return this.yayinTarihi;
    }
    public void setKitapIsmi(String kitapIsmi){
        this.KitapIsmi=kitapIsmi;
    }
    public void setSayfaSayisi(int sayfaSayisi){
        this.sayfaSayisi=sayfaSayisi;
    }
    public void setYazarinIsmi(String yazarinIsmi){
        this.yazarinIsmi=yazarinIsmi;
    }
    public void setYayinTarihi(int yayinTarihi){
        this.yayinTarihi=yayinTarihi;
    }
}
