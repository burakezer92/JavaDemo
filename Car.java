public class Car {
    int hiz;
    String model="Test";
    String renk;
    Car (int hiz,String model,String renk){
        this.hiz = hiz;
        this.renk= renk;
        this.model=model;
    }
    Car(){

    }

    int hizlandirma(int a){

        return this.hiz +=a;
    }
    int yavaslatma (int a){
        this.hiz -= a;
        return this.hiz;
    }
    void renkGoster (){
        System.out.println(this.renk);
    }
    void hizGoster(){
        System.out.println(this.hiz);
    }
}
