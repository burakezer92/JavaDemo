package OgrenciBilgiSistemi;

public class Ogretmen {
   String isim;
   String telno;
   String bolum;

   Ogretmen(String isim,String telno,String bolum){
       this.isim = isim;
       this.telno = telno;
       this.bolum = bolum;
   }
   void OgrtmnBilgiYazdir(){
       System.out.println(this.isim + ' ' + this.telno + ' ' + this.bolum);
   }



}
