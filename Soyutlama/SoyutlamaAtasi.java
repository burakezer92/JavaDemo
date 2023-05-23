package Soyutlama;

public abstract class SoyutlamaAtasi {
    private String a;
    private String b;
    private Integer c;
    SoyutlamaAtasi(String a,String b,Integer c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public String getA(){
        return a;
    }
    public void setA(String d){
        this.a=d;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }
    public abstract void deneme(String a);
    public void deneme2(){
        System.out.println("deneme2");
    }
}
