import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class APIStream {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(50);
        a.add(40);
        a.add(30);
        a.add(20);
        a.add(10);
        a.add(10);

        //a.stream().forEach(i -> System.out.println(i));//Stream methodları lambda methodları gibi kısa yazmaya yarar uzun methodları
        //a.stream().distinct().forEach(i -> System.out.println(i));//aynı sayıları almaz distinct sayesinde
        //a.stream().filter(c -> c<10).forEach(i -> System.out.println(i));//filtreleme var
        a.stream().sorted().forEach(i -> System.out.println(i));//sıralama ters sıralam için sorted(Comparator.reverseOrder()) yazılır
    }
}
