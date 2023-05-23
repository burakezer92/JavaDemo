package Koleksiyonlar;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MethodPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {//Linkedlist ile aynı fakat sıralama istediğimiz gibi yapabiliyoruz.
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        pq.add("z");
        pq.add("Ezer");
        pq.add("Deneme");
        pq.add("Burak");
        Iterator<String> itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
