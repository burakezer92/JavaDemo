package DaireAlani;

public class Alan {
    public int yaricap;
    public static final double PI_SAYISI=3.14;
    public Alan(int a){
        this.yaricap = a;
    }
    public double AlanHesapla(){
         return this.yaricap*this.yaricap*Alan.PI_SAYISI;
    }
}
