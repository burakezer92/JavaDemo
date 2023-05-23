package Soyutlama;

public class Soyutlama extends SoyutlamaAtasi implements IArayuz {
    String z;
    Soyutlama(String a,String b,Integer c,String z){
        super(a,b,c);
        this.z=z;
    }

    @Override
    public void deneme(String o) {
        System.out.println(o + "deneme methodu");
        System.out.println(this.PI);
    }
    @Override
    public boolean InterMethod(String n){
        System.out.println(n+ "Interface methodu");
        return true;
    }



}
