package Koleksiyonlar;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class MethodLinkedList {
    public static void main(String[] args) {
        List<Integer> a = new LinkedList<>();//Liste methoduyla aynı ortalardan veya başından ekleme yaprsan daha avantajlı maliyet açısından .eleman başonda ve sonunda pointer tutuyor
        a.add(5);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(2,1);
        Iterator<Integer> b = a.iterator();
        while (b.hasNext()){
            System.out.println(b.next());
        }

    }
}
