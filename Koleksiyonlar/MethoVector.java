package Koleksiyonlar;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class MethoVector {
    public static void main(String[] args) {
        List<Integer> a = new Vector<>();//Vektör Arraylistle aynı fakat daha yavaş ve eski.Kullanılmıyor fazla
        a.add(9);
        a.add(8);
        a.add(7);
        a.add(6);
        a.add(5);
        Iterator<Integer> i = a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
