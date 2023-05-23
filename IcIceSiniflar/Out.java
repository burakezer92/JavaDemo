package IcIceSiniflar;

public class Out {
    public int a=10;
    public class In{
        public int a=1;
        public void run(){
            int a=2;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);
        }
    }
    public void run(){
        In in =new In();
        in.run();
    }

    public In getIn(){
        In in =new In();
        return in;
        //return new In();      Bu şekildede kullanılabilir
    }
}
