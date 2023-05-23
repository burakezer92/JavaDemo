public class Main2 {
    public static void main(String[] args) {

        Car toyota = new Car(100,"corolla","mavi");
        toyota.renkGoster();
        System.out.println(toyota.hiz);
        toyota.yavaslatma(10);
        System.out.println(toyota.hiz);
        System.out.println(toyota.model);
        Car bmw = new Car();
        System.out.println(bmw.model);

    }
}
