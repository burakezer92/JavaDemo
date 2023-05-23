package SiniflarArasiIliskiler;

public class Main {
    public static void main(String[] args) {
        Academician aka1 = new Academician("Ahmet");
        Academician aka2 = new Academician("Mehmet");
        Course ders1 = new Course("Matematik","MAT101",aka1,15);
        Course ders2 = new Course("Türkçe","TUR101",aka2,82);
        ders2.setDerskodu("12231");
        System.out.println(ders2.getDerskodu());
        System.out.println();
        Course[] dizi = {ders1,ders2};
        System.out.println(aka2.hesapla(dizi));
        System.out.println(ders1.getDersAkdms().getAcaname());
        Student s1 = new Student("deneme","deneme2");
        System.out.println(s1.getAcaname());
        s1.hesapla(dizi);
        System.out.println(s1.hesapla(dizi));
        System.out.println("------------------------");
        Academician aka3 = new Student("poliad","polisoyad");

        System.out.println(aka3.hesapla(dizi));
        Academician[] diziaka = new Academician[2];
        diziaka[1]=s1;
        diziaka[0]=aka1;

        for(Academician a:diziaka){
            System.out.println(a.getAcaname());
            System.out.println(a.hesapla(dizi));
        }




    }


}
