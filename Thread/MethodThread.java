package Thread;

public class MethodThread extends Thread {
    private String name;
    public MethodThread(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(this.name + "Nesnesi çalıştı " + i);
        }
    }
}
