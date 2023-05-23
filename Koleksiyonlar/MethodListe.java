package Koleksiyonlar;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MethodListe {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();//Sıralı şekilde dizilere benzer
        a.add(10);
        a.add(5);
        a.add(50);
        a.add(25);
        a.add(7);
        a.add(5);
        Iterator<Integer> i=a.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("------------------------------");
        for(Integer b:a){
            System.out.println(b);
        }
        System.out.println("------------------------------");
        System.out.println(a.lastIndexOf(5));
        System.out.println(a.indexOf(5));
        System.out.println("------------------------------");
        a.set(0,67);
        a.add(3,99);
        for(Integer b:a){
            System.out.println(b);
        }
        System.out.println(a.remove(0));
        System.out.println("------------------------------");
        for(Integer b:a){
            System.out.println(b);
        }
        List<Integer> liste2 = new ArrayList<>();
        liste2.addAll(a);
        System.out.println(liste2);

        Object[] odizi = liste2.toArray();
        Integer[] sdizi = liste2.toArray(new Integer[0]);
        System.out.println(sdizi[0]);


    }

}
