package Koleksiyonlar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MethodHashset {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();//sırasız hash sırasıyla sıralanır.(Setlerde aynı eleman iki veya daha fazla varsa bir kayıt tutulur)
        LinkedHashSet<Integer> b = new LinkedHashSet<>();//FIFO ilk giren ilk çıkar yani sıralı. hashsetin subclassı
        b.add(5);
        b.add(4);
        b.add(3);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        for(Integer i : a){
            System.out.println(i);
        }
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        Iterator<Integer> c = a.iterator();//iterator tüm elemanları gezmeyi sağlar
        while (c.hasNext()){//Sonradan veri geliyor mu?kontrol
            System.out.println(c.next());//iterator sonradan yazılan elemanı bastırır
        }
        c = b.iterator();
        while(c.hasNext()){
            System.out.println(c.next());
        }

    }


}
