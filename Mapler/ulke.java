package Mapler;

public class ulke {
    private String ulke_adi;
    private int ulke_kod;
    private String baskent;
    ulke(String ulke_adi,int ulke_kod,String baskent){
        this.ulke_adi=ulke_adi;
        this.ulke_kod=ulke_kod;
        this.baskent=baskent;
    }
    public String getUlke_adi(){
        return this.ulke_adi;
    }
    public int getUlke_kod(){
        return this.ulke_kod;
    }
    public String getBaskent(){
        return this.baskent;
    }
    public void setUlke_adi(String a){
        this.ulke_adi=a;
    }
    public void setUlke_kod(int a){
        this.ulke_kod=a;
    }
    public void setBaskent(String a){
        this.baskent=a;
    }
}
