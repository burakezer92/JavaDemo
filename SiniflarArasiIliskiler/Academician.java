package SiniflarArasiIliskiler;

public class Academician {
    private String acaname;
    Academician(String a){
        this.acaname=a;
    }

    public String getAcaname() {
        return acaname;
    }
    public double hesapla(Course[] a){
        double total=0;
        for(int i=0;i<a.length;i++){
            total+=a[i].getDerssaati();
        }
        return total/a.length;
    }
}
