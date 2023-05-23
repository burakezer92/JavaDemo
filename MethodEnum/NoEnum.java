package MethodEnum;

public class NoEnum {
    public static NoEnum pzt = new NoEnum(1,"Pazartesi");
    public static NoEnum sal = new NoEnum(2,"Salı");
    public static NoEnum car = new NoEnum(3,"Çarşamba");
    public static NoEnum per = new NoEnum(4,"Perşembe");
    public static NoEnum cum = new NoEnum(5,"Cuma");
    public static NoEnum cmt = new NoEnum(6,"Cumartesi");
    public static NoEnum pzr = new NoEnum(7,"Pazar");
    int gunNo;
    String ad;
    private NoEnum(int a,String b){
        this.gunNo=a;
        this.ad=b;
    }
    public String getAd(){
        return this.ad;
    }
    public int getgunNo(){
        return this.gunNo;
    }
    public void setGunNo(int a){
        this.gunNo=a;
    }
    public void setAd(String a){
        this.ad=a;
    }

}
