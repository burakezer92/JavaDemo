package OgrenciBilgiSistemi;

import java.awt.*;

public class Ogrenci {
    Ders tur;
    Ders fiz;
    Ders mat;
    String adi;
    String okulno;
    double ort;
    boolean durum;
    Ogrenci(String adi,Ders tur,Ders mat,Ders fiz,String okulno){
        this.adi=adi;
        this.okulno=okulno;
        this.ort=0.0;
        this.durum=false;
        this.tur =tur;
        this.mat = mat;
        this.fiz = fiz;
    }
    void NotGir(int tur,int fiz,int mat){
        if (0<=tur&&100>=tur){
            this.tur.not = tur;
        }
        if (0<=fiz&&100>=fiz){
            this.fiz.not = fiz;
        }
        if (0<=mat&&100>=mat){
            this.mat.not = mat;
        }


    }
    void SozluNotGir(int tur,int fiz,int mat){
        if (0<=tur&&100>=tur){
            this.tur.SozluNot = tur;
        }
        if (0<=fiz&&100>=fiz){
            this.fiz.SozluNot = fiz;
        }
        if (0<=mat&&100>=mat){
            this.mat.SozluNot = mat;
        }


    }

    void ortbul(){
        this.ort = ((this.fiz.not + this.tur.not + this.mat.not)*0.8+(this.fiz.SozluNot + this.tur.SozluNot + this.mat.SozluNot)*0.2)/3.0;
        System.out.println("Fizik Notu:" + this.fiz.not);
        System.out.println("Matematik Notu:" + this.mat.not);
        System.out.println("Türkçe Notu:" + this.tur.not);
        System.out.println("Fizik Sözlü Notu:" + this.fiz.SozluNot);
        System.out.println("Matematik Sözlü Notu:" + this.mat.SozluNot);
        System.out.println("Türkçe Sözlü Notu:" + this.tur.SozluNot);
        System.out.println(this.ort);
    }
    void bastir(){
        System.out.println(this.adi + this.okulno +this.tur.not);
    }

    boolean gecmeDurumu(){
        if (this.ort<50){
            return false;
        }else {
            return true;
        }
    }



}
