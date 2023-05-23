package SiniflarArasiIliskiler;

public class Student extends Academician{
    private String soyadi;
    Student(String a,String b){
        super(a);//kalıtım
        this.soyadi = b;
    }
    public String getSoyadi(){
        return this.soyadi;
    }
    public void setSoyadi(String c){
        this.soyadi =c;
    }
    public void asd(String n){
        this.getAcaname();
    }
    @Override
    public double hesapla(Course[] a){
        double total=0;
        for(int i=0;i<a.length;i++){
            total+=a[i].getDerssaati();
        }
        return 1.155;
    }

}
