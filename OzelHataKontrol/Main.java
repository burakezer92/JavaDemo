package OzelHataKontrol;

public class Main {
    public static void HataKontrol() throws Exception{
        throw new OzelExc("OZELEXzHATA");
    }
    public static void main(String[] args) throws Exception {
        //HataKontrol();
        try {
            HataKontrol();
        }catch (OzelExc e){
            System.out.println(e.toString());
        }

    }
}
