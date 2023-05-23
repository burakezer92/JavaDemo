package Koleksiyonlar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MethodQueue {
    public static void main(String[] args) {
        //polimorfizm oluyor
        Queue<Integer> q = new LinkedList<>();//Öncekinin ve sonrakinin adresini tutar
        q.add(56);
        q.add(798);
        q.add(12);
        q.add(677);
        System.out.println(q.element());
        System.out.println(q.peek());
        Iterator<Integer> itr = q.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }



}
