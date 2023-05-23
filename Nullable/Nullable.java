package Nullable;

public class Nullable<T> {//GENERIC Sınıflar
    private final T s1;
    String s2=null;
    String s3="";

    Nullable(T s1){
        this.s1=s1;
    }

    public T getS1() {
        return s1;
    }

    public boolean isNull(){
        return this.getS1()==null;
    }
    public void run(){
        if(isNull()){
            System.out.println("NULL");
        }else {
            System.out.println(this.getS1());
        }
    }
}
