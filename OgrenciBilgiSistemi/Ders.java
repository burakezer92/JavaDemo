package OgrenciBilgiSistemi;

public class Ders {
    String adi;
    String kodu;
    Ogretmen bolumogretmeni;
    Ogretmen sorumluOgrt;
    String bolum;
    int SozluNot;
    int not;
    Ders(String adi,String kodu,Ogretmen bolumogretmeni,Ogretmen sorumluOgrt,String bolum){
        this.adi=adi;
        this.kodu=kodu;
        this.bolumogretmeni = bolumogretmeni;
        this.sorumluOgrt = sorumluOgrt;
        this.bolum = bolum;
    }
    void SrmlOgrtAta(Ogretmen sorumluOgrt){
        if(sorumluOgrt.bolum.equals(bolum)){
            this.sorumluOgrt = sorumluOgrt;
            DersOgrtmeniYaz();
        }else{
            System.out.println("uygun değil");
        }

    }
    void DersOgrtmeniYaz(){
        System.out.println(this.adi + this.kodu);
        this.bolumogretmeni.OgrtmnBilgiYazdir();
        this.sorumluOgrt.OgrtmnBilgiYazdir();

    }
}

