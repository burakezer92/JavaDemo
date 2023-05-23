package BoksOyunu;

public class Musabaka {
    Boksor b1;
    Boksor b2;
    int minkilo;
    int maxkilo;
    Musabaka(Boksor b1,Boksor b2,int minkilo,int maxkilo){
        this.b1=b1;
        this.b2=b2;
        this.minkilo=minkilo;
        this.maxkilo=maxkilo;
    }
    void b1vurma(){
        this.b2.can = this.b1.vurma(b2);
        System.out.println(this.b2.isim +" Canı: "+this.b2.can);

    }
    void b2vurma(){
        this.b1.can = this.b2.vurma(b1);
        System.out.println(this.b1.isim +" Canı: "+this.b1.can);

    }

    void baslama(){
        if(sikletkontrol()){
            double x = Math.random()*2;
            while (this.b1.can>0&&this.b2.can>0){
                System.out.println("**********Yeni Round**********");
                if(x>1){
                    b2vurma();
                    if(kazananbk()) {
                        break;
                    }
                    b1vurma();
                    if(kazananbk()) {
                        break;
                    }
                }else{
                    b1vurma();
                    if(kazananbk()) {
                        break;
                    }
                    b2vurma();
                    if(kazananbk()) {
                        break;
                    }
                }


                }

            }else{
            System.out.println("Boksör sikletleri uygun değil.");
        }
        }


    boolean sikletkontrol(){
        if((this.b1.siklet >= this.minkilo && this.b1.siklet <= this.maxkilo)&&(this.b2.siklet >= this.minkilo && this.b2.siklet <= this.maxkilo)){
            return true;
        }else{
            return false;
        }
    }

    boolean kazananbk(){
        if(this.b1.can==0){
            System.out.println(this.b2.isim + " kazandı");
            return true;
        }
        if (this.b2.can==0){
            System.out.println(this.b1.isim + " kazandı");
            return true;
        }
        return false;
    }

}
