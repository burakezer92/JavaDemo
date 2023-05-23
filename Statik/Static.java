package Statik;

public class Static {
    String dersadi;
    int not;
    String derskodu;
    static int derssaati=0;
    Static(String a,int b,String c){
        this.dersadi=a;
        this.not=b;
        this.derskodu=c;
    }
    public void ortal(){
        System.out.println(this.dersadi + this.derskodu + this.not);
        derssaati++;
    }
    public static void sortal(){
        System.out.println(derssaati);
    }
}
