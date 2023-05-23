package Thread;

public class MethodRunable implements Runnable{
    private String name;
    MethodRunable(String a){
        this.name=a;
    }
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(this.name + " => " + i);
        }
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name=n;
    }
}
