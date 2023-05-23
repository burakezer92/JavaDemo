package MethodEnum;

public enum YesEnum {
    pazartesi(1),//Enum sınıflar sınıftan belli sayıda method üretilecekse bunu sınıf içerisinden daha kolay yapar ve dışarıdan nesne üretilemezler.
    sali(2),
    carsamba(3),
    persembe(4),
    cuma(5),
    cumartesi(6),
    pazar(7);
    private int gunno;
    private YesEnum(int a){
        this.gunno=a;
    }
    public int getGunno() {
        return gunno;
    }
}
