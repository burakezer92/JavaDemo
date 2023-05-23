package Paket1;

public class Sinif2 {
    private String x;
    protected Sinif2(String a){
        this.x=a;
    }
    public void bastir(){
        System.out.println(this.x);
    }
    protected void bastirp(){
        System.out.println(this.x);
    }
    private void bastirpri(){
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        Sinif2 u =new Sinif2("sadsadasd");
        u.bastirpri();
    }
}
