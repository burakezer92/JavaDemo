package GenericInterface;

public class Main {
    public static void main(String[] args) {
        Student<Integer> a = new Student<>();
        a.insert(1);
        Student<String> b = new Student<>();
        b.insert("asdasd");
    }
}
