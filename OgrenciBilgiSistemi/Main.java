package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Ogretmen o1 = new Ogretmen("Albert","55555","FZK");
        Ogretmen o2 = new Ogretmen("Tesla","44444","FZK2");
        Ogretmen o3 = new Ogretmen("Mahmut","3333","TUR");
        Ogretmen o4 = new Ogretmen("Külyutmaz","7777","MAT");
        Ders fizik = new Ders("Fizik","f101",o1,o2,"FZK");
        Ders tur = new Ders("Türkçe","t101",o3,o2,"TUR");
        Ders fiz = new Ders("Fizik","f101",o2,o2,"FZK2");
        Ders mat = new Ders("Matematik","m101",o4,o2,"MAT");
        Ogrenci st1 = new Ogrenci("İnek Şaban",tur,mat,fiz,"999");
        st1.NotGir(20,20,20);
        st1.SozluNotGir(100,100,100);
        st1.ortbul();
        if(st1.gecmeDurumu()==true){
            System.out.println("Sınıfı Geçti");
        }else
        {
            System.out.println("Sınıfta kaldı.");
        }


    }


}
