package Thread;

public class MethodThreadSle implements Runnable{
    private String name;
    private int gecikme;
    private boolean durdur = true;
    MethodThreadSle(String name,int gecikme){
        this.name=name;
        this.gecikme=gecikme;
    }
    @Override
    public void run(){
        int i=0;
        while(durdur){
                System.out.println(this.name + " => " + i);
                i++;
                try {
                    Thread.sleep(this.gecikme);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }



        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void durdurmethod(){
        this.durdur=false;
    }
}
