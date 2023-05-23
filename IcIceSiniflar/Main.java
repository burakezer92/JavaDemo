package IcIceSiniflar;

public class Main {
    public static void main(String[] args) {
        Out out = new Out();
        out.run();

        Out o = new Out();
        Out.In inNesnesi =o.new In();
        inNesnesi.run();

        Out.In inNesnesi2 = o.getIn();
        inNesnesi2.run();
    }
}
