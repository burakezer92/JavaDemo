package SiniflarArasiIliskiler;

public class Course {
    private String dersadi;
    private String derskodu;
    private Academician dersAkdms;
    private int derssaati;
    Course(String a,String b,Academician c,int d){
        this.dersadi=a;
        this.derskodu=b;
        this.dersAkdms=c;
        this.derssaati=d;
    }
    public String getDersadi(){
        return this.dersadi;
    }
    public void setDersadi(String a){
        this.dersadi=a;
    }
    public String getDerskodu(){
        return this.derskodu;
    }
    public void setDerskodu(String b){
        this.derskodu=b;
    }
    public Academician getDersAkdms(){
        return this.dersAkdms;
    }
    public void setDersAkdms(Academician a){
       this.dersAkdms=a;
    }

    public int getDerssaati(){
        return this.derssaati;
    }
    public void setDerssaati(int a){
        this.derssaati=a;
    }

}
