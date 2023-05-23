package BoksOyunu;

public class Boksor {
    String isim;
    int hasar;
    int can;
    int siklet;
    int bloklama;
    Boksor(String isim,int hasar,int can,int siklet,int bloklama){
        this.isim = isim;
        this.hasar = hasar;
        this.can = can;
        this.siklet=siklet;
        if(bloklama>=0&&bloklama<=100){
            this.bloklama=bloklama;
        }else {
            this.bloklama=0;
        }

    }
    Boksor(){

    }

    int vurma(Boksor rboksor){
        System.out.println(this.isim + "=>" + rboksor.isim + "\t" + this.hasar);
        if(isBloklama()){
            System.out.println(rboksor.isim + " bloklama yaptı");
            return rboksor.can;
        }
        if(rboksor.can - this.hasar <0){
            return 0;
        }
        return  (rboksor.can-this.hasar);
    }

    boolean isBloklama(){
        double randomNumber = Math.random()*100;
        if(this.bloklama>=randomNumber){
            return true;
        }else {
            return false;
        }

    }






}
